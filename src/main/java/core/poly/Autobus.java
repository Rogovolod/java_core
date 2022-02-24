package core.poly;

public class Autobus implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " ride on road");
    }

    @Override
    public void size() {
        System.out.println(getClass().getSimpleName() + " small");
    }
}

