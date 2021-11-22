package array;

/*
Метод принимает двумерный массив у которого число рядов и число элементов в ряду не совпадают,
также количество элементов в каждом ряду может быть абсолютно произвольным.
Вам необходимо реализовать метод так, чтобы на выходе получился двумерный квадратный массив.
При этом размерность выходного массива должна рассчитываться.
Если для полного заполнения выходного массива в исходном массиве не хватает элементов - необходимо дополнить массив 0.

Например:
Исходный массив {{1}, {2, 3, 4}} - должно получиться {{1, 2}, {3, 4}}
Исходный массив {{1}, {2, 3, 4}, {5, 6}} - должно получиться {{1, 2, 3}, {4, 5, 6}, {0, 0, 0}}
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Converter {

    public static void main(String[] args) {
        int[][] array = {{1}, {2, 3, 4}, {5, 6}, {7, 8, 9, 10, 11}};
        System.out.println(Arrays.deepToString(Converter.convertInSquareArray(array)));
        int[][] expected = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 0}, {0, 0, 0, 0}};
        System.out.println(Arrays.deepToString(expected));

    }

    public static int[][] convertInSquareArray(int[][] array) {
        int count = 0;
        List<Integer> list = new ArrayList<>();
        for (int[] ints : array)
            for (int anInt : ints)
                list.add(anInt);

        while (Math.sqrt(list.size()) % 1 != 0)
            list.add(0);

        int arraySize = (int) Math.sqrt(list.size());
        int[][] rsl = new int[arraySize][arraySize];
        for (int i = 0; i < arraySize; i++)
            for (int j = 0; j < arraySize; j++) {
                rsl[i][j] = list.get(count);
                count++;
            }
        return rsl;
    }


}