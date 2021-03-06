package core.condition;

public class Max {

    public static int max(int first, int second) {
        boolean condition = first > second;
        int result = condition ? first : second;
        return result;
    }

    public static int max(int first, int second, int third) {
        return max(
                first,
                max(second, third)
        );
    }

    public static int max(int first, int second, int third, int fourth) {
        return max(
                first,
                max(second, third, fourth)
        );
    }
}
