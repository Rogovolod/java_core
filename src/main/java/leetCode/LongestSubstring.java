package leetCode;

import java.util.HashSet;

//TODO: This don't pass last test. Need to rewrite
public class LongestSubstring {

    public static int lengthOfLongestSubstring(String s) {
        char[] a = s.toCharArray();
        HashSet<Character> characterSet = new HashSet<>();
        int rsl = 0;
            for (int i = 0; i < a.length; i++) {
                characterSet.clear();
                for (int j = i; j < a.length; j++) {
                    if (characterSet.contains(a[j])) {
                        characterSet.clear();
                    }
                    characterSet.add(a[j]);
                    if (characterSet.size() > rsl) {
                        rsl = characterSet.size();
                    }
                }
            }
        return rsl;
    }

}
