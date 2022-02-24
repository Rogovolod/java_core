package core.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SummingMethod {

    public static class User {

        private String name;

        private List<Bill> bills;

        public User(String name, List<Bill> bills) {
            this.name = name;
            this.bills = bills;
        }

        public String getName() {
            return name;
        }

        public List<Bill> getBills() {
            return bills;
        }
    }

    public static class Bill {

        private int balance;

        public Bill(int balance) {
            this.balance = balance;
        }

        public int getBalance() {
            return balance;
        }
    }

    public static Map<String, Integer> summing(List<User> users) {
        return users.stream().collect(Collectors.groupingBy(User::getName, Collectors.summingInt(user -> user.getBills().stream().mapToInt(Bill::getBalance).sum())));
    }

}

