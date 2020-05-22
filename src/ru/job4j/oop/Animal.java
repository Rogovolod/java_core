package ru.job4j.oop;

public class Animal {

    public Animal() {
        super();
        System.out.println("load animal");
    }

    public Animal(String name) {
    }

    public static void main(String[] args) {
        Predator predator = new Predator("predator");
    }
}