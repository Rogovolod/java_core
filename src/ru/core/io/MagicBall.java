package ru.core.io;

import java.util.Scanner;
import java.util.Random;

public class MagicBall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Я великий Оракул. Что ты хочешь узнать? ");
        String q = input.nextLine();
        int a = new Random().nextInt(3);
        if (a == 0) {
            System.out.println("Да.");
        }
        if (a == 1) {
            System.out.println("Нет.");
        }
        if (a == 2) {
            System.out.println("Может быть.");
        }
    }
}
