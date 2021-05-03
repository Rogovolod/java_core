package ru.core.lambda;


import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaUsage {

    public static String[] s = new String[]{"b", "a", "d", "c"};

    public  static Comparator<String> cmpDescSize = (left, right) -> {
        System.out.println("compare - " + left + " : " + right);
        return right.compareTo(left);
    };

    public static void main(String[] args) {
        Arrays.sort(s, cmpDescSize);
        System.out.println(Arrays.toString(s));
    }

    @Test
    public void mainTest() {
        String[] a = new String[]{"d", "c", "b", "a"};
        Arrays.sort(s, cmpDescSize);
        assertArrayEquals(a, s);
    }

}

