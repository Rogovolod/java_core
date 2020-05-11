package ru.job4j.oop;

    public class Predator extends Animal {
        public Predator() {
            super();
            System.out.println("load predator");
        }

        public static void main(String[] args) {
            Tiger tiger = new Tiger();
        }
    }