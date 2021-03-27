package ru.core.loop;

public class PrimeNumber {

    public int calc(int x) {
        int n = 0;
        for (int a = 1; a <= x; a++) {
            if (CheckPrimeNumber.check(a)) {
                n = n + 1;
            }
        }
        return n;
    }
}