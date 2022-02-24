package core.calculator;

public class Fit {
    public static double manWeight(double height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }
    public static double womanWeight(double height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }
    public static void main(String[] args) {
        double man = Fit.manWeight(182);
        double women = Fit.womanWeight(162);
        System.out.println("The ideal weight for a man 182sm height is " + man + " kg");
        System.out.println("The ideal weight for a woman 162sm height is " + women + " kg");
    }
}
