package calculator;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class BigCalculator {

    public static void main(String[] args) {
        var in = new Scanner(System.in);
        while (true) {
            var line = in.nextLine();
            if (line.isBlank()) {
                System.out.println("Your input is empty.");
                continue;
            }
            if (line.contains("exit")) System.exit(-1);
            line = line.replace("*", " * ");
            line = line.replace("-", " - ");
            line = line.replace("+", " + ");
            line = line.replace("/", " / ");
            var out = new Scanner(line);
            try {
                var first = out.nextBigDecimal();
                var sign = out.next();
                var second = out.nextBigDecimal();
                var rsl = new BigDecimal(0);
                switch (sign) {
                    case "/" -> rsl = first.divide(second, 100, RoundingMode.HALF_UP);
                    case "*" -> rsl = first.multiply(second);
                    case "+" -> rsl = first.add(second);
                    case "-" -> rsl = first.subtract(second);
                }
                System.out.println(rsl);
            } catch (InputMismatchException i) {
                System.out.println("Wrong input, just write numbers, it's calculator.");
            } catch (NoSuchElementException e) {
                System.out.println("Wrong input, don't forget arithmetic sign and second number.");
            }

        }
    }
}
