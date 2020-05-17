package ru.job4j.condition;

public class Triangle {

    private Point first;
    private Point second;
    private Point third;

    public Triangle(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }

    public double period(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return p;
    }

    public double area(int x1, int y1, int x2, int y2, int x3, int y3) {
        double a = first.distance(second);
        double b = first.distance(third);
        double c = second.distance(third);
        double p = period(a, b, c);
        double rsl = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        if (this.exist(a, b, c)) {
            rsl = -1;
        }
        return rsl;
    }

    public static boolean exist(double a, double b, double c) {
        if ((a + b) < c || (a + c) < b || (b + c) < a) {
            return false;
        }
        return true;
    }
}