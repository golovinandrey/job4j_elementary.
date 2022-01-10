package ru.job4j.calculator;

public class Club {
    public static void permission(boolean hasMoney, boolean biFriend) {
        if (hasMoney || biFriend) {
            System.out.println("I can go to the club.");
        } else {
            System.out.println("I can't go");
        }
    }

    public static void main(String[] args) {
        Club.permission(true, true);
        Club.permission(true, false);
        Club.permission(false, true);
        Club.permission(false, false);
    }
}
