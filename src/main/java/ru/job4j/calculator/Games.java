package ru.job4j.calculator;

public class Games {
    public static void permission(boolean allowByParent, boolean hasMoney) {
        if (allowByParent && hasMoney) {
            System.out.println("I can go to the play club");
        } else {
            System.out.println("I can't");
        }
    }

    public static void main(String[] args) {
        Games.permission(true, true);
        Games.permission(true, false);
        Games.permission(true, false);
        Games.permission(false, false);
    }
}
