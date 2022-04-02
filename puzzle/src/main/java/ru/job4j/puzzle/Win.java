package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if ( board[i][i] == 1 && (WinHorizontal(board, i) || WinVertical(board, i))){
                result = true;
                break;
            }
        }
        return result;
    }

    public static boolean WinHorizontal(int[][] board, int row) {
        boolean result = true;
        for (int column = 0; column < board.length; column++) {
            if(board[row][column] == 0) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean WinVertical(int[][] board, int column) {
        boolean result = true;
        for (int row = 0; row < board.length; row++) {
            if (board[row][column] == 0) {
                result = false;
                break;
            }
        }
        return result;
    }
}
