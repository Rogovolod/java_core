import java.util.List;
import java.util.Scanner;
import java.util.function.BiConsumer;

public class Main {


    public static void main(String[] args) {
        var s = new Scanner(System.in);
        var input = s.next();
        System.out.print(input.equals(new StringBuilder(input).reverse().toString()) ? "Yes" : "No");
    }

}

