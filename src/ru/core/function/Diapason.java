package ru.core.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Diapason {

    public  static  List<Double> diapason(int start, int end, Function<Double, Double> func) {
        var rsl = new ArrayList<Double>();
        for (double i = start; i < end; i++) {
            rsl.add(func.apply(i));
        }
        return rsl;
    }
}