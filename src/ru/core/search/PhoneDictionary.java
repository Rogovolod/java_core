package ru.core.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {

    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> findOld(String key) {
        var rsl = new ArrayList<Person>();
        for (int i = 0; i < persons.size(); i++) {
            if (persons.get(i).getName().contains(key) || persons.get(i).getSurname().contains(key) || persons.get(i).getPhone().contains(key) || persons.get(i).getAddress().contains(key)) {
                rsl.add(persons.get(i));
            }
        }
        return rsl;
    }

    public ArrayList<Person> find(String key) {

        Predicate<Person> checkByName = x -> x.getName().contains(key);
        Predicate<Person> checkBySurname = x -> x.getSurname().contains(key);
        Predicate<Person> checkByPhone = x -> x.getPhone().contains(key);
        Predicate<Person> checkByAddress = x -> x.getAddress().contains(key);

        Predicate<Person> combine = checkByName.or(checkBySurname).or(checkByPhone).or(checkByAddress);

        var result = new ArrayList<Person>();
        for (Person person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }

}