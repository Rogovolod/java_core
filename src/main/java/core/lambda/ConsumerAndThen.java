package core.lambda;

import java.util.function.Consumer;

public class ConsumerAndThen {

    public static Consumer<String> consumer(String input) {
        Consumer<String> print = (i) -> System.out.print(i);
        Consumer<String> ln = (k) -> System.out.println();

        print.andThen(ln).accept(input);

        return print; // что-то не так
    }

    public static void main(String[] args) {
        consumer("- yo, nigga");
        System.out.print("Эта строка должна быть ниже");
    }
}