package core.condition;

public class AlertDivByZero {
    public static void main(String[] args) {
        possibleDiv(4);
        possibleDiv(-8);
    }

    public static void possibleDiv(int number) {
        boolean result = number < 0;
        if (result) {
            System.out.println("This is negative numbers");
        }
    }
}
