package ru.job4j.calculator;

public class AlertDivByZero {
    public static void main(String[] args) {
        possibleDiv(4);
        possibleDiv(0);
        possibleDiv(-3);
    }

    public static void possibleDiv(int number) {
        if (number < 0) {
            System.out.println("This is negative number");
        }
    }
}
