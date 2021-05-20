package array;

import java.util.Scanner;

public class SumMaxElementsInColumns {


    private static final int N = 7;
    private static final int M = 4;

    /**
     * Ввести с клавиатуры массив int[n][m]
     * создать библиотеку в которой будет содержаться метод, который производит вычисления
     * Вычислить сумму индексов максимального элемента матрицы
     * n = 7
     * m = 4
     * @param args
     * в матрице нужно найти максимальный элемент в каждом столбце, а потом вычислить их сумму
     */

    public static void main(String[] args) {
        var matrix = new int[N][M];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print("Введите элемент " + (i + 1) + " строки " + (j + 1) + " столбца: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        int max = 0;
        int rsl = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                  max = matrix[i][0];
                if (max < matrix[i][j]) {
                    max = matrix[i][j];
                    rsl = i + j;
                }
            }
        }
        System.out.println("Сумма индексов максимального элемента матрицы[" + max + "] \n Равна: " + rsl);
    }


}
