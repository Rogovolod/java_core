package interview;

import static java.lang.Math.abs;

public class FindNearestToTen {

    public static int find(int[] array) {
        int moreThenTen = Integer.MAX_VALUE;
        int lessThenTen = Integer.MIN_VALUE;
        for (int num : array) {
            if (num > 10 && num < moreThenTen)
                moreThenTen = num;
            if (num < 10 && num > lessThenTen)
                lessThenTen = num;
        }
        return abs(10 - moreThenTen) > abs(10 - lessThenTen) ? lessThenTen : moreThenTen;
    }

}
