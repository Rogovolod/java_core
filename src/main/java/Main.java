import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        var currentMonthAndYear = LocalDateTime.now().format(DateTimeFormatter.ofPattern("LLLL yyyy", new Locale("ru")));
        System.out.println(currentMonthAndYear);
    }
}

