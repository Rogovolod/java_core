package ru.core.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] a1 = o1.split("/");
        String[] a2 = o2.split("/");

//        if (a2[0].equals(a1[0])) {
//            return a1[a1.length - 1].compareTo(a2[a2.length - 1]);
//        }
//        if (a1.length > 1 && a2.length > 1) {
//            if (a2[1].equals(a1[1])) {
//                return a1[a1.length - 1].compareTo(a2[a2.length - 1]);
//            }
//        }

        return a2[0].compareTo(a1[0]);
    }
}
