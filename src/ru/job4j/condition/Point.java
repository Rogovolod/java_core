package ru.job4j.ru.job4j.condition;

import java.math.MathContext;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double first = x2 - x1;
        double second = y2 - y1;
        double a = Math.pow(first, 2);
        double b = Math.pow(second, 2);
        double plus = a + b;
        double rsl = Math.sqrt(plus);
        return rsl;
    }
    public static void main(String[] args) {
        double result = Point.distance(7, 0, 0, 6);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }
}