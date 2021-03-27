package ru.core.search;

import java.util.ArrayList;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        ArrayList<Person> rsl = new ArrayList<Person>();
        for (int i = 0; i < persons.size(); i++) {
            if (persons.get(i).getName().contains(key) || persons.get(i).getSurname().contains(key) || persons.get(i).getPhone().contains(key) || persons.get(i).getAddress().contains(key)) {
                rsl.add(persons.get(i));
            }
        }
        return rsl;
    }
}