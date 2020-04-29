package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }
    public static float rubleToRMB(float value){
        float rsl = value * 1040 / 100;//10.40 не дал записать, выдал ошибку
        return rsl;
    }
    public static float rubleToJPY(float value){
        float rsl = value * 69 / 100; //0.69 не дал записать, выдал ошибку
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(1000);
        float dollar = Converter.rubleToDollar(1000);
        float RMB = Converter.rubleToRMB(1000);
        float JPY = Converter.rubleToJPY(1000);
        System.out.println("1000 rubles are " + euro + " euro.");
        System.out.println("1000 rubles are " + dollar + " dollar");
        System.out.println("1000 rubles are " + RMB + " RMB");
        System.out.println("1000 rubles are " + JPY + " JPY");
    }
}
