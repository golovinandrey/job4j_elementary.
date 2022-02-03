package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length - 1; index++) {
            if (array[index] == null) {
                String temp = array[index];
                array[index] = array[index + 1];
                array[index + 1] = temp;
                for (int i = 0; i < array.length - 1; i++) {
                    if (array[i] == null) {
                        String rsl = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = rsl;
                    }
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int i = 0; i < compressed.length; i++) {
            System.out.print(compressed[i] + " ");
        }
    }
}
