import java.util.Scanner;

public class Echo {

    public static void main(String[] args) {
        int[] array = {4, 5, -5, 4, 96, 43, 53, 23, 3, 9};
        var f = new Scanner(System.in);
        var b = f.next();
        int l1 = array[0];
        int l2 = array[0];
        for (int i = 1; i < array.length; i++) {
            if (l1 < array[i]) {
                l2 = l1;
                l1 = array[i];
            } else if (l2 < array[i]) {
                l2 = array[i];

            }
        }
        System.out.println(l2);
    }
}