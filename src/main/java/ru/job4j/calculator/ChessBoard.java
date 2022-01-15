package ru.job4j.calculator;

public class ChessBoard {

    public static boolean isValid(int coordinate) {
        return coordinate >= 0 && coordinate <= 7;
    }

    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (isValid(x1) && isValid(y1) && isValid(x2) && isValid(y2)) {
            if (((x1 + x2) % 2 == 0) && ((y1 + y2) % 2 == 0) || ((x1 + x2) % 2 != 0) && ((y1 + y2) % 2 != 0)) {
                rsl = Math.abs(x2 - x1);
                rsl = rsl == 0 ? Math.abs(y2 - y1) : rsl;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        int result = ChessBoard.way(2, 6, 4, 1);
        System.out.println(result);
    }
}
