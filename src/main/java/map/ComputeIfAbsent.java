package map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class ComputeIfAbsent {

    public static void main(String[] args) {
        Map<Integer, String> names = new HashMap<>(Map.of(1, "", 2, ""));
        List<User> users = List.of(
                new User(1, "name1"),
                new User(2, "name2"),
                new User(3, "name3"),
                new User(4, "name4")
        );
        Map<Integer, String> rsl = ComputeIfAbsent.collectData(names, users);
        Map<Integer, String> expected = Map.of(4, "name4", 1, "name1", 2, "name2", 3, "name3");
        System.out.println(rsl);
        System.out.println(expected);
        System.out.println(rsl.equals(expected));
    }


    public static Map<Integer, String> collectData(Map<Integer, String> names, List<User> users) {
        for (int i = 0; i < users.size(); i++) {
            String name = users.get(i).getName();
            if (names.containsKey(users.get(i).getId()))
                names.computeIfPresent(users.get(i).getId(), (k, l) -> name);
            else names.computeIfAbsent(users.get(i).getId(), k -> name);
        }
        return names;
    }

    public static class User {
        private int id;
        private String name;

        public User(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ComputeIfAbsent.User user = (ComputeIfAbsent.User) o;
            return Objects.equals(name, user.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }
}