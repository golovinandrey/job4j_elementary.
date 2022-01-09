package ru.job4j.calculator;

public class Max {
    public static String max(int left, int right) {
        String result = left > right ? ("Левое число больше правого") : ("Правое число больше левого");
        return result;
    }

    public static void main(String[] args) {
        String msg = Max.max(90, 60);
        System.out.println(msg);
    }
}
