package games.rps;

import java.util.Random;
import java.util.Scanner;

public class Rps {

    private static byte wins;
    private static byte looses;
    private static String input;
    private static final Scanner scanner = new Scanner(System.in);
    private static final String[] data = new String[]{"камень", "ножницы", "бумагу"};
    private static Random rnd = new Random();

    public static void main(String[] args) {

        System.out.println("=== Добро пожаловать! ===");
        System.out.println("Введите: камень, ножницы или бумага, чтобы сыграть. Победите три раза, чтобы стать чемпионом.");
        System.out.println("Если хотите выйте введите: -1");
        do {
            System.out.println("Колличество ваших побед: " + wins);
            System.out.println("Колличество ваших поражений: " + looses);
            if (looses >= 3) {
                System.out.println("Это конец, противник одолел вас...");
                playAgain();
            }
            if (wins >= 3) {
                System.out.println("Поздравляем! Время праздновать победу!");
                playAgain();
            }
            input = scanner.next();
            int number = rnd.nextInt(3);
            if (input.equals("камень")) {
                System.out.println("Ваш опонент выбрал " + data[number]);
                if (number == 0) {
                    System.out.println("Ничья!");
                    System.out.println("=============================");
                    continue;
                }
                if (number == 1) {
                    System.out.println("Победа за вами! Камень сокрушил ножницы");
                    System.out.println("=============================");
                    ++wins;
                    continue;
                }
                if (number == 2) {
                    System.out.println("Поражение! Бумага бьёт камень.");
                    System.out.println("=============================");
                    ++looses;
                    continue;
                }
            }
            if (input.equals("ножницы")) {
                System.out.println("Ваш опонент выбрал " + data[number]);
                if (number == 1) {
                    System.out.println("Ничья!");
                    System.out.println("=============================");
                    continue;
                }
                if (number == 2) {
                    System.out.println("Победа за вами! Ножницы разрезали бумагу.");
                    System.out.println("=============================");
                    ++wins;
                    continue;
                }
                if (number == 0) {
                    System.out.println("Поражение! Камень сокрушил ваши ножницы.");
                    System.out.println("=============================");
                    ++looses;
                    continue;
                }
            }
            if (input.equals("бумага")) {
                System.out.println("Ваш опонент выбрал " + data[number]);
                if (number == 2) {
                    System.out.println("Ничья!");
                    System.out.println("=============================");
                    continue;
                }
                if (number == 0) {
                    System.out.println("Победа за вами! Бумага бьёт камень.");
                    System.out.println("=============================");
                    ++wins;
                    continue;
                }
                if (number == 1) {
                    System.out.println("Поражение! Ножницы разрезали бумагу.");
                    System.out.println("=============================");
                    ++looses;
                }
            } else {
                System.out.println("Неверный ввод.");
                System.out.println("=============================");
            }
        }
        while (!input.equals("-1"));
    }

    private static void playAgain() {
        System.out.println("Хотите сыграть ещё раз? введите \"да\" или \"нет\"");
        do {
            input = scanner.next();
            if (input.equals("да")) {
                wins = 0;
                looses = 0;
                System.out.println("Начнём снова!");
                System.out.println("=============================");
                System.out.println("Введите: камень, ножницы или бумага, чтобы сыграть. Победите три раза, чтобы стать чемпионом.");
                break;
            }
            if (input.equals("нет")) {
                System.out.println("До свидания! Да хранят вас боги.");
                System.exit(0);
            } else {
                System.out.println("Неверный ввод");
            }
        }
        while (true);
    }

}