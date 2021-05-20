package array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int delivery = money - price;
        for (int coin : coins) {
            while (delivery - coin >= 0) {
                delivery -= coin;
                rsl[size] = coin;
                size++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}