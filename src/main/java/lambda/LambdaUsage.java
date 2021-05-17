package lambda;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaUsage {

    public static void main(String[] args) {
        String[] s = new String[]{"b", "a", "d", "c"};
        Comparator<String> cmpDescSize = (left, right) -> {
            System.out.println("compare - " + left + " : " + right);
            return right.compareTo(left);
        };
        Arrays.sort(s, cmpDescSize);

        System.out.println(Arrays.toString(s));
    }


}

