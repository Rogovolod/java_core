package core.loop;

import java.util.*;
import java.util.stream.Collectors;

public class Merge {

    public static void main(String[] args) {
        merge(new int[]{1, 3, 4, 5}, new int[]{2, 6, 7, 8});
    }

    public static int[] merge(int[] left, int[] right) {
        ArrayList<Integer> integerArray = (ArrayList<Integer>) Arrays.stream(left).boxed().collect(Collectors.toList());
        integerArray.addAll(Arrays.stream(right).boxed().collect(Collectors.toList()));
        return integerArray.stream().sorted().mapToInt(i -> i).toArray();
    }

}