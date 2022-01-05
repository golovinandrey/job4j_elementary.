package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double minusAndDivide(double first, double second) {
        return minus(first, second) + divide(first, second);
    }

    public static double sumAll(double first, double second) {
        return sum(first, second) + multiply(first, second) + minus(first, second) + divide(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета 1 метода равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета 2 метода равен: " + minusAndDivide(20, 10));
        System.out.println("Результат расчета 3 метода равен: " + sumAll(20, 10));
    }

}
