package core.array;

public class SecondLargest {

    public static int findSecondMaxNumber(int[] numbers) {
        int first = 0;
        int second = 0;
        for (int number : numbers) {
            if (number > first) {
                second = first;
                first = number;
            }
            else if (number > second && number != first)
                second = number;
        }
        return second;
    }

}