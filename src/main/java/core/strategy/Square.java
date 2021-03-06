package core.strategy;

public class Square implements Shape {
    @Override
    public String draw() {
        String ln = System.lineSeparator();
        return    " _________" + ln
                + " |       |" + ln
                + " |       |" + ln
                + " |_______|" + ln;
    }

    public static void main(String[] args) {
        System.out.println(new Square().draw());
    }
}