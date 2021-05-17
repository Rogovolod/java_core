package condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double s = p * (p - a) * (p - b) * (p - c);
        double rsl = Math.sqrt(s);
        return rsl;
    }
    public static void main(String[] args) {
        double rsl = TrgArea.area(3, 2, 3);
        System.out.println("area (3, 2, 3) = " + rsl);
    }
}