package ru.job4j.array;

public class Definition {
    public static void main(String[] args) {
        String[] names = new String[4];
        names[0] = "Petr Arsentev";
        names[1] = "Andrew Golovin";
        names[2] = "Pavel Markov";
        names[3] = "Ivan Ivanov";
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
