package oop;

    public class Predator extends Animal {

       public Predator() {
       }

        public Predator(String name) {
            super(name);
            System.out.println("load predator");
        }

        public static void main(String[] args) {
            Predator predator = new Predator();
        }
    }