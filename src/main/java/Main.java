import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        var currentMonthAndYear = LocalDateTime.now().format(DateTimeFormatter.ofPattern("LLLL yyyy", new Locale("ru")));
//        System.out.println(currentMonthAndYear);
        var old = new File("testText.txt");
        var newF = new File("Text.txt");
        System.out.println(newF.delete());

    }
}

