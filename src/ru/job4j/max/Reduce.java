package ru.job4j.max;

public class Reduce {
    private int[] arr;

    public void to(int[] array) {
        arr = array;
    }

    public void print() {
        for (int index = 0; index < arr.length; index++) {
            System.out.println(arr[index]);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        Reduce reduce = new Reduce();
        reduce.to(array);
        reduce.print();
    }
}