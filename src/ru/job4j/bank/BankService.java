package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {

    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        if (!users.containsKey(user)) {
            users.put(user, new ArrayList<Account>());
        } else {
            System.out.println("User is already exist!");
        }
    }

    public void addAccount(String passport, Account account) {
        User usr = findByPassport(passport);
            List<Account> acc = users.get(usr);
            if (!acc.contains(account)) {
                acc.add(account);
                users.put(usr, acc);
            }
    }

    public User findByPassport(String passport) {
        for (User usr : users.keySet()) {
            if (usr.getPassport().equals(passport)) {
                return usr;
            }
        }
        System.out.println("Can't find user!");
        return null;
    }

    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user == null) {
            return null;
        }
        for (Account acc : users.get(user)) {
            if (acc.getRequisite().equals(requisite)) {
                return acc;
            }
        }
        System.out.println("Can't find account");
        return null;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
/*
        Метод для перечисления денег с одного счёта на другой счёт.
        Если счёт не найден или не хватает денег на счёте srcAccount (с которого переводят), то метод должен вернуть false.

                Посмотрите на методы Map.putIfAbsent и List.contains, как их можно применить в этом задании.

        Метод putIfAbsent позволяет проверить, если ли такой ключ в карте или нет и если его нет, то произвести вставку данных.
                Этот метод позволяет уменьшить количество кода.

                Метод List.indexOf позволяет найти индекс элемента по значению. Проверка элементов в этом методе происходит по методу equals.
                Обратите внимание, что в моделях User и Account используется только одно поле passport и requisite для сравнения объектов.
                Это позволяет использовать эти методы, без информации о всех полях.
*/
        User susr = findByPassport(srcPassport);
        User durs = findByPassport(destPassport);

        List<Account> list1 = new ArrayList<Account>();
        List<Account> list2 = new ArrayList<Account>();

        Account srs = findByRequisite(srcPassport, srcRequisite);
        Account dest = findByRequisite(destPassport, destRequisite);

        if (srs.getBalance() < amount) {
            return false;
        }

        srs.setBalance(srs.getBalance() - amount);
        dest.setBalance(dest.getBalance() + amount);
        list1.add(srs);
        users.putIfAbsent(susr, list1);

        list2.add(dest);
        users.putIfAbsent(durs, list2);

        return true;
    }

    public static void main(String[] args) {
/*        List<Account> accounts = new ArrayList<>();
        String requisite = "3fdsbb9";
        accounts.add(new Account("3fdsbb9", 140));
        int index = accounts.indexOf(new Account(requisite, -1));
        Account find = accounts.get(index);
        System.out.println(find.getRequisite() + " -> " + find.getBalance());*/

        User user = new User("322110", "Pavel Savin");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("8000 2384 9876", 500D));
        bank.addAccount(user.getPassport(), new Account("8000 2384 9880", 0D));
        bank.transferMoney(user.getPassport(), "8000 2384 9876", user.getPassport(), "8000 2384 9880", 250D);
        System.out.println("Баланс первой карты 9876: " + bank.findByRequisite(user.getPassport(), "8000 2384 9876").getBalance());
        System.out.println("Баланс второй карты 9880: " + bank.findByRequisite(user.getPassport(), "8000 2384 9880").getBalance());
    }

    @Override
    public String toString() {
        return "BankService{"
                + "users = " + users
                + '}';
    }
}