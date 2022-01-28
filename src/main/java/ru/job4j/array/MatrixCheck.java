package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board.length - 1; i++) {
                if (board[row][i + 1] != 'X') {
                    result = false;
                    break;
                }
        }
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int i = 0; i < board.length - 1; i++) {
            if (board[i + 1][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }
}
