package ru.core.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FreezeStr {

    public static boolean eq(String left, String right) {

        ArrayList<String> o1 = new ArrayList<String>(Arrays.asList(left.split("")));
        ArrayList<String> o2 = new ArrayList<String>(Arrays.asList(right.split("")));

        for (String s : o2) {
            if (!o1.contains(s)) {
                return false;
            } else {
                o1.remove(s);
            }
        }
        return true;
    }

    public static boolean eqHashMap(String left, String right) {

        var first = left.toCharArray();
        var second = right.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < first.length; i++) {
            if (map.containsKey(first[i])) {
                map.put(first[i], map.get(first[i]) + 1);
            }
            map.putIfAbsent(first[i], 1);
        }
        for (char key : second) {
            if (!map.containsKey(key)) {
                return false;
            } else {
                map.put(key, map.get(key) - 1);
                if (map.get(key) <= 0){
                    map.remove(key);
                }
            }
        }
        return true;
    }

    public static boolean eqSort(String left, String right) {

        var first = left.toCharArray();
        var second = right.toCharArray();

        Arrays.sort(first);
        Arrays.sort(second);

        return Arrays.equals(first, second);
    }

}
