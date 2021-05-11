package ru.core.live;

import java.util.*;

public class JavaStack {

    public static String javaStack(String s) {
        Scanner sc = new Scanner(s);
        StringBuilder stringBuilder = new StringBuilder();
        while (sc.hasNext()) {
            String input = sc.next();
            var data = input.toCharArray();
            int l = 0;
            int r = 0;
            if(data[0] == ')' || data[0] == '}' || data[0] == ']') {
                stringBuilder.append(false);
                stringBuilder.append("\n");
                continue;
            }
            for (int i = 0; i < data.length;i++) {
                if(data[i] == '(' || data[i] == '{' || data[i] == '[') {
                    l++;
                } if(data[i] == ')' || data[i] == '}' || data[i] == ']') {
                    r++;
                }
            }
            stringBuilder.append(l==r);
            stringBuilder.append("\n");
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        return new String(stringBuilder);
    }

}
