package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListDataStructures {

    public static List<Integer> func(String input) {

        Scanner scanner = new Scanner(input);
        var array = new ArrayList<Integer>();
        var size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            array.add(scanner.nextInt());
        }
        var insert = "Insert";
        var delete = "Delete";

        var sizeD = scanner.nextInt();
        for (int i = 0; i < sizeD; i++) {
        var temp = scanner.next();
        if (scanner.hasNext() && temp.equals(insert)) {
            array.add(scanner.nextInt(), scanner.nextInt());
        }
        if (scanner.hasNext() && temp.equals(delete)) {
                array.remove(scanner.nextInt());
        }
        }
        return array;
    }

}
