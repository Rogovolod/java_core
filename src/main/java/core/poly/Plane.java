package core.poly;

public class Plane implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " fly");
    }

    @Override
    public void size() {
        System.out.println(getClass().getSimpleName() + " big");
    }
}
