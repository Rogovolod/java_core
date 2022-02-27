package games.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean player = true;
        byte count = 11;
        System.out.println("На столе лежат 11 спичек. Два игрока по очереди берут от 1 до 3 спичек.");
        System.out.println("Выигрывает тот, кто забрал последние спички.");
        System.out.println("*****ПОЕХАЛИ!*****");
        while (count > 0) {
            System.out.printf("Ходит игрок %s%n", player ? "1" : "2");
            int select = Integer.parseInt(in.nextLine());
            while (select <= 0 ||  select > 3) {
                System.out.println("Действие невозможно, пожалуйста повторите ввод.");
                select = Integer.parseInt(in.nextLine());
            }
            count -= select;
            player = !player;
            if (count < 0) {
                count = 0;
            }
            System.out.println("На столе осталось " + count + " спичек.");
            if (count == 0) {
                player = !player;
                System.out.println(String.format("Победил игрок %s", player ? "1" : "2"));
            }
            }
    }
}
