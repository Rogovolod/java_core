package ru.job4j.condition;

public class Triangle {

    public static boolean exist(double ab, double ac, double bc) {
        boolean ex = ab + ac > bc && ac + bc > ab && ab + bc > ac;
        boolean rsl = ex ? true : false;
        return rsl;
    }
}