package ru.job4j.calculator;

public class SqArea {
    public static double squarea(double p, double k) {
        double h = p / (2 * (k + 1));
        double L = h * k;
        double s = L * h;
        return s;
    }

    public static void main(String[] args) {
        double result1 = SqArea.squarea(6, 2);
        System.out.println("p = 4, k = 1, s = 1, real = " + result1);
    }
}
