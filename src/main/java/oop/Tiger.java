package oop;

public class Tiger extends Predator {

    public Tiger() {
    }

    public Tiger(String name) {
        super(name);
        System.out.println("load tiger");
    }

    public static void main(String[] args) {
        Tiger tiger = new Tiger();
    }
}
