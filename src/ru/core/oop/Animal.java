package ru.core.oop;

public class Animal {

    public Animal() {
    }

    public Animal(String name) {
        super();
        System.out.println("load animal");
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
    }
}