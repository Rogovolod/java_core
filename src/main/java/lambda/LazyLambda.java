package lambda;

import java.util.Arrays;
import java.util.Comparator;

public class LazyLambda {

    public static void main(String[] args) {
        String[] names = {
                "Ivan",
                "Petr"
        };
        String[] oneName = {"Bob"};

        Comparator<String> lengthCmp = (left, right) -> {
            System.out.println("execute comparator");
            return left.length() - right.length();
        };

        Arrays.sort(names, lengthCmp);
        Arrays.sort(oneName, lengthCmp);
    }

}
