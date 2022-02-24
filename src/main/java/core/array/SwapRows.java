package core.array;

import java.util.Arrays;

public class SwapRows {


    public static void main(String[] args) {

        int[][] test = new int[][] {
                {4, 5, 6, 7, 8, 9},
                {1, 2, 3, 4, 9, 9}
        };
        System.out.println(Arrays.deepToString(test));
        swap(test, 0, 1);
        System.out.println(Arrays.deepToString(test));

    }

    public static void swap(int[][] data, int src, int dst) {
        for (int i = 0; i < data[src].length; i++) {
            data[src][i] = data[src][i] + data[dst][i];
            data[dst][i] = data[src][i] - data[dst][i];
            data[src][i] = data[src][i] - data[dst][i];
        }
    }
}
