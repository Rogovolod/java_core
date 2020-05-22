package ru.job4j.oop;

    public class Predator extends Animal {
        public Predator(String name) {
            super(name);
            System.out.println("load predator");
        }


        public static void main(String[] args) {
            Tiger tiger = new Tiger("tiger");
        }
    }