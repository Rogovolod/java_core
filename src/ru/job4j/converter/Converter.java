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
        double rsl = value * 10.4;
        return rsl;
    }
    public static double rubleToJPY(double value) {
        double rsl = value * 0.69;
        return rsl;
    }

    public static void main(String[] args) {
        double euro = Converter.rubleToEuro(1000);
        double dollar = Converter.rubleToDollar(1000);
        double rmb = Converter.rubleToRMB(1000);
        double jpy = Converter.rubleToJPY(1000);
        System.out.println("1000 rubles are " + euro + " euro.");
        System.out.println("1000 rubles are " + dollar + " dollar");
        System.out.println("1000 rubles are " + rmb + " RMB");
        System.out.println("1000 rubles are " + jpy + " JPY");
    }
}
