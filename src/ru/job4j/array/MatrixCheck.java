package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = 1; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[row][j] != board[row][i]) {
                    result = false;
                    break;
                }
            }
        }
        return result;
        }
    }
