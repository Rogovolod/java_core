package bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {

    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
            users.putIfAbsent(user, new ArrayList<Account>());
    }

    public void addAccount(String passport, Account account) {
        User usr = findByPassport(passport);
        if (usr != null) {
            List<Account> acc = users.get(usr);
            if (!acc.contains(account)) {
                acc.add(account);
            }
        } else {
            System.out.println("Can't find user by passport.");
        }
    }

    public User findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(s -> s.getPassport().equals(passport))
                .findFirst()
                .orElse(null);
    }

    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user == null) {
            return null;
        }
        return users.get(user)
                .stream()
                .filter(s -> s.getRequisite().equals(requisite))
                .findFirst()
                .orElse(null);
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {

        Account srs = findByRequisite(srcPassport, srcRequisite);
        Account dest = findByRequisite(destPassport, destRequisite);

        if (srs == null || srs.getBalance() < amount || dest == null) {
            return false;
        }

        srs.setBalance(srs.getBalance() - amount);
        dest.setBalance(dest.getBalance() + amount);

        return true;
    }

    @Override
    public String toString() {
        return "BankService{"
                + "users = " + users
                + '}';
    }
}