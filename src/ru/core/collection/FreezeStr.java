package ru.core.collection;

import java.util.ArrayList;
import java.util.Arrays;

public class FreezeStr {
    public static boolean eq(String left, String right) {

        ArrayList<String> o1 = new ArrayList<String>(Arrays.asList(left.split("")));
        ArrayList<String> o2 = new ArrayList<String>(Arrays.asList(right.split("")));

        for (String s : o2) {
            if(!o1.contains(s)) {
                return false;
            } else {
                o1.remove(s);
            }

        }
        return true;
    }
}
