package bank;

import java.math.BigDecimal;
import java.util.*;

/**
 * Класс содержит методы для манипуляций с аккаунтом
 * @author Rogovolod
 * @version 1.0
 */
public class BankService {

    /**
     * Хранение пользователей и их аккаунтов осуществляется в коллекции типа HashMap
     */
    private Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод принимает на вход пользователя и добвляет его в хранилище
     * Если такой пользователь уже есть, то ничего не происходит
     * @param user пользователь, который добавляется в хранилище
     */
    public void addUser(User user) {
            users.putIfAbsent(user, new ArrayList<Account>());
    }

    /**
     * Метод принимает на вход паспорт пользователя и аккаунт, который нужно прикрепить к пользователю
     * Если такого пользователя не существует, то выводится сообщение
     * Если такой аккаунт уже есть, то ничего не происходит
     * @param passport паспорт, по которому осуществляется поиск пользователя
     * {@link BankService#findByPassport(String)}}
     * @param account аккаунт, который нужно добавить
     */
    public void addAccount(String passport, Account account) {
        Optional<User> usr = findByPassport(passport);
        if (usr.isPresent()) {
            List<Account> acc = users.get(usr.get());
            if (!acc.contains(account)) {
                acc.add(account);
            }
        } else {
            System.out.println("Can't find user by passport.");
        }
    }

    /**
     * Метод принимает на вход паспорт пользователя и возвращает пользователя с таким паспортом
     * @param passport паспорт, по которому осуществляется поиск пользователя
     * @return возвращает пользователя найденного по паспорту
     */
    public Optional<User> findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(s -> s.getPassport().equals(passport))
                .findFirst();
    }

    /**
     * Метод позволяет найти аккаунт по входным данным
     * Принимает на вход паспорт пользователя и реквизиты аккаунта
     * Возвращает найденный аккаунт
     * @param passport паспорт пользователя
     * @param requisite реквизиты, по которому осуществляется поиск аккаунта
     * @return возвращает аккаунт пользователя с заданнымим реквизитами
     */
    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<User> user = findByPassport(passport);
        return user.flatMap(value -> users.get(value).stream()
                .filter(e -> e.getRequisite().equals(requisite))
                .findFirst());
    }

    /**
     * Метод переводит деньги с одного счёта на другой
     * @param srcPassport паспорт пользователя, который осуществляет перевод
     * @param srcRequisite реквизиты аккаунта с которого будут списаны средства
     * @param destPassport паспорт получателя перевода
     * @param destRequisite счёт на который будут зачислены деньги
     * @param amount сумма зачисления
     * @return true в случае успеха и false в случае невозможности перевода
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, BigDecimal amount) {

        Optional<Account> srs = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> dest = findByRequisite(destPassport, destRequisite);

        if (srs.isPresent() && dest.isPresent() && srs.get().getBalance().compareTo(amount) >= 0) {
            srs.get().setBalance(srs.get().getBalance().subtract(amount));
            dest.get().setBalance(dest.get().getBalance().add(amount));
            return  true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "BankService{"
                + "users = " + users
                + '}';
    }
}