package core.collection;

import java.util.ArrayList;
import java.util.Arrays;

public class Article {
    public static boolean generateBy(String origin, String line) {

        ArrayList<String> o1 = new ArrayList<String>(Arrays.asList(origin.split(" |\\.|\\,|\\:|\\;|\\!|\\?")));
        ArrayList<String> o2 = new ArrayList<String>(Arrays.asList(line.split(" |\\.|\\,|\\:|\\;|\\!|\\?")));

        for (String s : o2) {
            if (!o1.contains(s)) {
                return false;
            } else {
                o1.remove(s);
            }
        }
        return true;
    }
}