package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 11;
        int turn = 1;
        System.out.println("На столе лежат 11 спичек. Два игрока по очереди берут от 1 до 3 спичек.");
        System.out.println("Выигрывает тот, кто забрал последние спички.");
        System.out.println("*****ПОЕХАЛИ!*****");
        while (count > 0) {
            System.out.println("Игрок " + turn + ", ваш ход. Сколько спичек вы уберёте?");
            int select = Integer.valueOf(in.nextLine());
            while (select != 1 && select != 2 && select != 3) {
                System.out.println("Действие невозможно, пожалуйста повторите ввод.");
                select = Integer.valueOf(in.nextLine());
            }
            count -= select;
            if (turn < 2) {
                turn++;
            } else {
                turn--;
            }
            if (count < 0) {
                count = 0;
            }
            System.out.println("На столе осталось " + count + " спичек.");
            if (count == 0) {
                if (turn < 2) {
                    turn++;
                } else {
                    turn--;
                }
            System.out.println("Игрок " + turn + " победил!");
            }
            }
        }
    }
