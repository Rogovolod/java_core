package core.calculator;

import static core.calculator.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }
    public static double minusAndDivSum(double first, double second) {
        return minus(first, second)
                + div(first, second);
    }

    public static double allFunctionsSum(double first, double second) {
        return minus(first, second)
                + div(first, second)
                + sum(first, second)
                + multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + minusAndDivSum(10, 20));
        System.out.println("Результат расчета равен: " + allFunctionsSum(10, 20));
    }
}