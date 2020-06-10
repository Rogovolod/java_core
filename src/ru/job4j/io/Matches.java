package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean player = false;
        byte count = 11;
        System.out.println("На столе лежат 11 спичек. Два игрока по очереди берут от 1 до 3 спичек.");
        System.out.println("Выигрывает тот, кто забрал последние спички.");
        System.out.println("*****ПОЕХАЛИ!*****");
        while (count > 0) {
            System.out.println("Игрок " + player + ", ваш ход. Сколько спичек вы уберёте?");
            int select = Integer.valueOf(in.nextLine());
            while (select != 1 && select != 2 && select != 3) {
                System.out.println("Действие невозможно, пожалуйста повторите ввод.");
                select = Integer.valueOf(in.nextLine());
            }
            count -= select;
            player = !player;
            }
            if (count < 0) {
                count = 0;
            }
            System.out.println("На столе осталось " + count + " спичек.");
            if (count == 0) {
                player = !player;
            System.out.println("Игрок " + player + " победил!");
            }
            }
        }
