package core.stream;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class Filter {

    public static void main(String[] args) {
        var list = new ArrayList<Integer>();
        for (int i = 0; i < 50; i++) {
            list.add(ThreadLocalRandom.current().nextInt(-100, 100 + 1));
        }
        System.out.println(list);

        var positiveList = list.stream().filter(x -> x > 0).collect(Collectors.toList());
        System.out.println(positiveList);
    }

}
