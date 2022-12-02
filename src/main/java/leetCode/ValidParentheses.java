package leetCode;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses {

    public boolean isValid2(String s) {
        char[] symbols = s.toCharArray();
        if (s.isBlank() || (s.length() & 1) != 0 ||
                symbols[0] == ')' ||
                symbols[0] == ']' ||
                symbols[0] == '}')
        return false;

        Deque<Character> stack = new ArrayDeque<>();
        for (char c : symbols) {
            switch (c) {
                case '(' -> stack.push(')');
                case '{' -> stack.push('}');
                case '[' -> stack.push(']');
                default -> {
                    if (stack.isEmpty() || stack.pop() != c) return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public boolean isValid(String s) {
        char[] chars = new char[s.length()];
        int index = -1;
        for (int i = 0; i < s.length(); i++) {
            char charAt = s.charAt(i);
            if (charAt == '(' || charAt == '[' || charAt == '{')
                chars[++index] = charAt;
            else if (index != -1 && ((int) charAt - (int) chars[index] == 1 ||
                    (int) charAt - (int) chars[index] == 2))
                index--;
            else
                return false;
        }
        return index == -1;
    }

}
