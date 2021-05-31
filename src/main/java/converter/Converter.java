package converter;

/**
 * Converter. Конвертирует рубли в иностранную валюту.
 * @author Savin Pavel
 */
public class Converter {

    /**
     * содержит значение рублей и результат конвертации в евро
     * @param value - количество рублей, которое нужно конвертировать.
     * @return rsl - результат конвертации в иностранной валюте
     */
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    /**
     * содержит значение рублей и результат конвертации в доллраы
     * @param value - количество рублей, которое нужно конвертировать.
     * @return rsl - результат конвертации в иностранной валюте
     */
    public static int rubleToDollar(int value) {
        int rsl = value / 60;
        return rsl;
    }

    /**
     * содержит значение рублей и результат конвертации в юани
     * @param value - количество рублей, которое нужно конвертировать.
     * @return rsl - результат конвертации в иностранной валюте
     */
    public static int rubleToRMB(int value) {
        int rsl = value / 10;
        return rsl;
    }

    /**
     * содержит значение рублей и результат конвертации в йены
     * @param value - количество рублей, которое нужно конвертировать.
     * @return rsl - результат конвертации в иностранной валюте
     */
    public static int rubleToJPY(int value) {
        int rsl = value / 2;
        return rsl;
    }

    /**
     * Method main
     * @param args - args
     */
    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        int dollar = Converter.rubleToDollar(120);
        int rmb = Converter.rubleToRMB(1000);
        int jpy = Converter.rubleToJPY(1000);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("120 rubles are " + dollar + " dollars");
        System.out.println("1000 rubles are " + rmb + " RMB");
        System.out.println("1000 rubles are " + jpy + " JPY");

        /**
         * @test проверяет выводимое значение
         */
        int in = 140;
        int expected = 2;
        int out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 euro. Test result : " + passed);
        int in2 = 120;
        int expected2 = 2;
        int out2 = rubleToDollar(in2);
        boolean passed2 = expected2 == out2;
        System.out.println("120 rubles are 2 dollars. Test result : " + passed2);
        int in3 = 1000;
        int expected3 = 100;
        int out3 = rubleToRMB(in3);
        boolean passed3 = expected3 == out3;
        System.out.println("1040 rubles are 100 rmb. Test result : " + passed3);
        int in4 = 1000;
        int expected4 = 500;
        int out4 = rubleToJPY(in4);
        boolean passed4 = expected4 == out4;
        System.out.println("1000 rubles are 690 JPY. Test result : " + passed4);
    }
}
