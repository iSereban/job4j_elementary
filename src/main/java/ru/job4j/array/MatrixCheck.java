package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int index = 0; index < board.length; index++) {
            if (board[row][index] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (char[] chars : board) {
            if (chars[column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int index = 0; index < board.length; index++) {
            rsl[index] = board[index][index];
        }
        return rsl;
    }

    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int row = 0; row < board.length; row++) {
            boolean resultrow = true;
            boolean resultcell = true;
            for (int cell = 0; cell < board.length; cell++) {
                if (board[row][cell] != 'X') {
                    resultrow = false;
                }
                if (board[cell][row] != 'X') {
                    resultcell = false;
                }
            }
            if (resultrow || resultcell) {
                row = board.length;
                result = true;
                break;
            }
        }
        return result;
    }
}