package interview;

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
        return moreThenTen - 10 <= 10 - lessThenTen ? moreThenTen : lessThenTen;
    }

}
