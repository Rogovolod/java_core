package ru.job4j.condition;

public class Max {

    public static int max(int first, int second, int third) {
        int rsl = 0;
        if (first >= second && first >= third) {
            rsl = first;
        }
        if (second >= first && second >= third) {
           rsl = second;
        }
        if (third >= first && third >= second) {
            rsl = third;
        }
        return rsl;
    }

    public static int max(int first, int second, int third, int fourth) {
        return max(
                first, second,
                max(second, third, fourth)
        );
    }

/**
* This old decision when max from 2
 * */
    public static int max2(int left, int right) {
        boolean condition = left > right;
        int result = condition ? left : right;
        return result;
    }
}
