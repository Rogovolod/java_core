package ru.core.rps;

import java.util.Random;
import java.util.Scanner;

public class Rps {
    public static void main(String[] args) {
        String[] data = new String[]{"камень", "ножницы", "бумагу"};
        Random rnd = new Random();
        boolean endless = true;
        System.out.println("=== Добро пожаловать! ===");
        System.out.println("Введите: камень, ножницы или бумага, чтобы сыграть. Играем до трёх побед.");
        System.out.println("Если хотите выйте введите: -1");
        Scanner scanner = new Scanner(System.in);
        String input;
        int wins = 0, loose = 0;
        do {
            System.out.println("Колличество ваших побед: " + wins);
            System.out.println("Колличество ваших поражений: " + loose);
            if (loose >= 3) {
                System.out.println("Это конец, противник одолел вас...");
                System.out.println("Хотите сыграть ещё раз? введите \"да\" или \"нет\"");
                do {
                    input = scanner.next();
                    if (input.equals("да")) {
                        wins = 0;
                        loose = 0;
                        System.out.println("Начнём снова!");
                        System.out.println("=============================");
                        System.out.println("Введите: камень, ножницы или бумага, чтобы сыграть. Играем до трёх побед.");
                        break;
                    }
                    if (input.equals("нет")) {
                        System.out.println("До свидания! Да хранят вас боги.");
                        System.exit(0);
                    } else {
                        System.out.println("Неверный ввод");
                    }
                }
                while (endless);
            }
            if (wins >= 3) {
                System.out.println("Поздравляем! Время праздновать победу!");
                System.out.println("Хотите сыграть ещё раз? введите \"да\" или \"нет\"");
                do {
                    input = scanner.next();
                    if (input.equals("да")) {
                        wins = 0;
                        loose = 0;
                        System.out.println("Начнём снова!");
                        System.out.println("=============================");
                        System.out.println("Введите: камень, ножницы или бумага, чтобы сыграть. Играем до трёх побед.");
                        break;
                    }
                    if (input.equals("нет")) {
                        System.out.println("До свидания! Да хранят вас боги.");
                        System.exit(0);
                    } else {
                        System.out.println("Неверный ввод");
                    }
                }
                while (endless);
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
                    ++loose;
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
                    ++loose;
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
                    ++loose;
                }
            } else {
                System.out.println("Неверный ввод.");
                System.out.println("=============================");
            }
        }
        while (!input.equals("-1"));
    }
}