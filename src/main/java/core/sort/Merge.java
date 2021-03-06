package core.sort;

import java.util.Arrays;

public class Merge {

    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        for (int c = 0; c < rsl.length; c++) {
            if (i >= left.length) {
                rsl[c] = right[j];
                j++;
            } else if (j >= right.length) {
                rsl[c] = left[i];
                i++;
            } else if (left[i] < right[j]) {
                rsl[c] = left[i];
                i++;
            } else {
                rsl[c] = right[j];
                j++;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[] {1, 3, 5},
                new int[] {2, 4}
        );
        System.out.println(Arrays.toString(rsl));
    }
}

