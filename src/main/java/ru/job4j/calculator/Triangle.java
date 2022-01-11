package ru.job4j.calculator;

public class Triangle {

    public static boolean exist(double ab, double ac, double bc) {
        return ab + ac > bc && ac + bc > ab && ab + bc > ac;
    }

    public static void main(String[] args) {
        boolean result = exist(2.0, 2.0, 2.0);
        System.out.println(result);
    }
}
