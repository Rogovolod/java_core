package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        int one = 1;
        if (number == one) {
            prime = false;
        }
        for (int index = 2; index <= number - 1; index++) {
            if (number % 2 == 0 || number % (number - 1) == 0) {
                prime = false;
                break;
            }
        }

        return prime;
    }
}