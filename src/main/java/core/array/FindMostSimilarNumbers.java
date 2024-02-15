package core.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindMostSimilarNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int j : array) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }
        int maxKey = 0;
        int maxValue = 0;
        for (Map.Entry<Integer, Integer> mapEl : map.entrySet()) {
            if (mapEl.getValue() >= maxValue) {
                maxValue = mapEl.getValue();
                maxKey = mapEl.getKey() > maxKey ? mapEl.getKey() : maxKey;
            }
        }

        System.out.println(maxKey);

    }

}
