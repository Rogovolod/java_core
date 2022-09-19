package interview;

public class SpacesBetweenString {

    public static String refactorSpaces(String str) {
        StringBuilder sb = new StringBuilder(str);
        int count = 0;
        int index = 1;
        int gap = 2;
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '_') {
                count++;
                sb.deleteCharAt(i);
                i--;
            }
        }
        for (int i = count; i > 0; i--) {
            if (index >= sb.length()) {
                index = 1;
                gap++;
            }
            sb.insert(index, '_');
            index += gap;
        }

        return sb.toString();
    }

}
