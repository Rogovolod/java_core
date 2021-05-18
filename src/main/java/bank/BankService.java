package bank;

import java.util.*;

public class BankService {

    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
            users.putIfAbsent(user, new ArrayList<Account>());
    }

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

    public Optional<User> findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(s -> s.getPassport().equals(passport))
                .findFirst();
    }

    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<User> user = findByPassport(passport);
        return user.flatMap(value -> users.get(value).stream()
                .filter(e -> e.getRequisite().equals(requisite))
                .findFirst());
    }

    public void transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {

        Optional<Account> srs = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> dest = findByRequisite(destPassport, destRequisite);

        srs.get().setBalance(srs.get().getBalance() - amount);
        dest.get().setBalance(dest.get().getBalance() + amount);
    }

    @Override
    public String toString() {
        return "BankService{"
                + "users = " + users
                + '}';
    }
}