package ru.job4j.condition;

public class Triangle {

    public double period(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return p;
    }

    public double area(int x1, int y1, int x2, int y2, int x3, int y3) {
        Point first = new Point(x1, y1);
        Point second = new Point(x2, y2);
        Point third = new Point(x3, y3);
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

    private boolean exist(double a, double c, double b) {
        if ((a + b) < c || (a + c) < b || (b + c) < a) {
            return false;
        }
        return true;
    }
}