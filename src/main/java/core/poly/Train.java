package core.poly;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " rides on rails");
    }

    @Override
    public void size() {
        System.out.println(getClass().getSimpleName() + " average");
    }
}
