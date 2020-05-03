package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        int one = 1;
        if (number == one) {
            prime = false;
        }
        for (int index = 2; index <= number - 1; index++) {
            if (number % index == 0) {
                prime = false;
                break;
            }
        }

        return prime;
    }
}