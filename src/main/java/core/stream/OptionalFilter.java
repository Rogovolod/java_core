package core.stream;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


/*
задача:
Известно, что работникам организации, у которых > 2 детей положены льготы для детей.
Но не всем детям, а тем, что младше 15.
Вам дан список и работников и паспорт интересующего работника.
Нужно найти список детей этого работника, которым положены льготы.
В системе уже есть метод поиска по паспорту, вам нужно используя этот метод дописать метод поиска детей
*/
public class OptionalFilter {

    public static class Worker {

        private String passport;

        private List<Child> children = new LinkedList<>();

        public Worker(String passport, List<Child> children) {
            this.passport = passport;
            this.children = children;
        }

        public String getPassport() {
            return passport;
        }

        public List<Child> getChildren() {
            return children;
        }
    }

    public static class Child {

        private String name;

        private int age;

        public Child(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }

    public static List<Child> defineChildren(List<Worker> workers, String passport) {
//        return findByPassport(workers, passport).get().getChildren().core.stream().filter(c -> c.getAge() < 15).collect(Collectors.toList());
        return workers.stream()
                .filter(w -> w.getChildren().size() > 2)
                .flatMap(worker -> findByPassport(workers, passport)
                        .stream()
                        .flatMap(w -> w.getChildren()
                                .stream()
                                .filter(child -> child.getAge() < 15)))
                .collect(Collectors.toList());
    }

    public static Optional<Worker> findByPassport(List<Worker> workers, String passport) {
        return workers.stream()
                .filter(w -> w.getPassport().equals(passport))
                .findFirst();
    }

}