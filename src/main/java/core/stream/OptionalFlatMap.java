package core.stream;

import java.util.List;
import java.util.Optional;
/*Задача найти первую строку, которая кончается на ".java" и вернуть Optional из длины этой строки*/
public class OptionalFlatMap {
    public static Optional<Integer> flatMap(List<String> strings) {
        return strings.stream().filter(s -> s.endsWith(".java")).map(String::length).findFirst();
    }

}
