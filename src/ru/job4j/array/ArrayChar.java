package ru.job4j.array;

public class ArrayChar {

    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int index = 0; index < pref.length - 1; index++) {
          if (word[0] != pref[0] || word[1] != pref[1]) {
              result = false;
          }
        }
        return result;
    }
}