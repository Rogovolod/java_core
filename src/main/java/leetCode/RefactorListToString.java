package leetCode;
/**
 * Given collection of Strings [null, "yuLia", "  ", "borjA", "Ceba", "", "aleNa", "daRek", "FranK", null, "yulia"]
 * Need to implement method that returns String “Alena - Borja - Ceba - Darek - Frank – Yulia"
 * <p>
 * Дана коллекция(или массив) строк: [null, "yuLia", "  ", "borjA", "Ceba", "", "aleNa", "daRek", "FranK", null, "yulia"]
 * Необходимо преобразовать метод, что бы возвращалась строка(не массив!) “Alena - Borja - Ceba - Darek - Frank – Yulia"
 */
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class RefactorListToString {

    public static String combine(List<String> asList) {
        return asList.stream()
                .filter(string -> Objects.nonNull(string) && !string.isBlank())
                .map(string -> string.substring(0, 1).toUpperCase() + string.substring(1).toLowerCase())
                .sorted(String::compareTo)
                .distinct()
                .collect(Collectors.joining(" - "));
    }

}
