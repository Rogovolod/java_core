import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dictionary {

    public static Map<String, List<String>> collectData(String[] strings) {
        Map<String, List<String>> rsl = new HashMap<>();
        List<String> list = new ArrayList<>();
        String s = "";
        for (int i = 0; i < strings.length; i++) {
            if (rsl.containsKey(String.valueOf(strings[i].charAt(0)))) {
                rsl.get(String.valueOf(strings[i].charAt(0))).add(strings[i]);
            } else {
                list.clear();
                rsl.put(String.valueOf(strings[i].charAt(0)), list);
                rsl.get(String.valueOf(strings[i].charAt(0))).add(strings[i]);
            }
        }
        return rsl;
    }

    public static Map<String, List<String>> collectData2(String[] strings) {
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            if(!map.containsKey(String.valueOf(strings[i].charAt(0)))) {
                map.put(String.valueOf(strings[i].charAt(0)), new ArrayList<>(List.of(strings[i])));
            } else {
                map.get(String.valueOf(strings[i].charAt(0))).add(strings[i]);
            }
        }
        return map;
    }

    public static void main(String[] args) {
        String[] data = {"two", "three", "four", "five", "six", "seven"};
        Map<String, List<String>> rsl = Dictionary.collectData(data);
        Map<String, List<String>> expected = Map.of(
                "s", List.of("six", "seven"),
                "t", List.of("two", "three"),
                "f", List.of("four", "five")
        );
        System.out.println(rsl.equals(expected));
    }

}