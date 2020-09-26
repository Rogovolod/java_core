package ru.job4j.search;

import java.util.ArrayList;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        for (int i = 0; i < persons.size(); i++) {
            if (persons.get(i).getName().contains(key)) {
                return persons;
            }
            if (persons.get(i).getSurname().contains(key)) {
                return persons;
            }
            if (persons.get(i).getPhone().contains(key)) {
                return persons;
            }
            if (persons.get(i).getAddress().contains(key)) {
                return persons;
            }
        }
        return null;
    }
}