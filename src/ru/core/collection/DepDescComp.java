package ru.core.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] a1 = o1.split("/");
        String[] a2 = o2.split("/");

//        if (a1[0].compareTo(a2[0]) == 0) {
//            if (a1.length == 2 && a2.length == 2) {
//                return a1[1].compareTo(a2[1]);
//            }
//            if (a1.length == 3 && a2.length == 3) {
//                return a1[2].compareTo(a2[2]);
//            }
//            return a1[a1.length - 1].compareTo(a2[a2.length -1]);
//        }

        return a2[0].compareTo(a1[0]);
    }
}
