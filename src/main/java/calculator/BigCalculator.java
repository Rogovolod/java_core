package calculator;

import java.math.BigDecimal;
import java.util.Scanner;

public class BigCalculator {

    public static void main(String[] args) {
        var in = new Scanner(System.in);
        var first = in.nextBigDecimal();
        var sign = in.next();
        var second = in.nextBigDecimal();
        var rsl = new BigDecimal(0);
        switch (sign) {
            case "/" -> rsl = first.divide(second);
            case "*" -> rsl = first.multiply(second);
            case "+" -> rsl = first.add(second);
            case "-" -> rsl = first.subtract(second);
        }

        System.out.println(rsl);
    }

}
