package ru.job4j.loop;

public class Mortgage {
    public int year(double amount, int salary, double percent) {
        int year = 0;
        percent = percent / 100;
        amount = amount + (amount * percent);
        while (salary <= amount) {
        amount = amount - salary;
        amount = amount + (amount * percent);
        year = year + 1;
        }
        year = year + 1;
        return year;
    }
}