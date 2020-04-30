package ru.job4j.converter;

public class Converter {

    public static double rubleToEuro(double value) {
        double rsl = value / 70;
        return rsl;
    }

    public static double rubleToDollar(double value) {
        double rsl = value / 60;
        return rsl;
    }
    public static double rubleToRMB(double value) {
        double rsl = value / 10.4;
        return rsl;
    }
    public static double rubleToJPY(double value) {
        double rsl = value * 0.69;
        return rsl;
    }

    public static void main(String[] args) {
        double euro = Converter.rubleToEuro(140);
        double dollar = Converter.rubleToDollar(120);
        double rmb = Converter.rubleToRMB(1000);
        double jpy = Converter.rubleToJPY(1000);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("120 rubles are " + dollar + " dollars");
        System.out.println("1000 rubles are " + rmb + " RMB");
        System.out.println("1000 rubles are " + jpy + " JPY");
        int in = 140;
        int expected = 2;
        double out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 euro. Test result : " + passed);
        int in2 = 120;
        int expected2 = 2;
        double out2 = rubleToDollar(in2);
        boolean passed2 = expected2 == out2;
        System.out.println("120 rubles are 2 dollars. Test result : " + passed2);
        int in3 = 1040;
        int expected3 = 100;
        double out3 = rubleToRMB(in3);
        boolean passed3 = expected3 == out3;
        System.out.println("1040 rubles are 100 rmb. Test result : " + passed3);
        int in4 = 1000;
        int expected4 = 690;
        double out4 = rubleToJPY(in4);
        boolean passed4 = expected4 == out4;
        System.out.println("1000 rubles are 690 JPY. Test result : " + passed4);
    }
}
