package ru.job4j.calculator;

public class SqArea {
   // @SuppressWarnings("checkstyle:LocalVariableName")
    public static double squarea(double p, double k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        double s = l * h;
        return s;
    }

    public static void main(String[] args) {
        double result1 = SqArea.squarea(6, 2);
        System.out.println("p = 4, k = 1, s = 1, real = " + result1);
    }
}
