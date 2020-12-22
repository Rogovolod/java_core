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

    @Override
    public String toString() {
        return "BankService{"
                + "users = " + users
                + '}';
    }
}