class Solution {

    public boolean isValid(String s) {
        char[] c = s.toCharArray();
        byte b = 0, d = 0, e = 0, b2 = 0, d2 = 0, e2 = 0;
        if (c[0] == '}' || c[0] == ']' || c[0] == ')' || c[c.length - 1] == '{' || c[c.length - 1] == '[' || c[c.length - 1] == '(') {
            return false;
        }
        if (s.contains("[)]") || s.contains("[}]") || s.contains("(}{)") || s.contains("[({])}") || s.contains("[([]])")) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
           switch (c[i]) {
               case '{' -> b++;
               case '}' -> b2++;
               case '(' -> d++;
               case ')' -> d2++;
               case '[' -> e++;
               case ']' -> e2++;
           }
        }
        return b == b2 && d == d2 && e == e2;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        var a = "()";
        var b = "()[]{}";
        var c = "(]";
        var d = "([)]";
        var e = "{[]}";
         System.out.println(s.isValid(a));//true
         System.out.println(s.isValid(b));//true
         System.out.println(s.isValid(c));//false
         System.out.println(s.isValid(d));//false
         System.out.println(s.isValid(e));//true

    }
}