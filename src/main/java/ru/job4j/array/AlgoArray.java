package ru.job4j.array;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[] {5, 2, 4, 1, 3};
        int temp = array[0];
        array[0] = array[4];
        array[4] = temp;
        temp = array[3];
        array[3] = array[0];
        array[0] = temp;
        temp = array[3];
        array[3] = array[2];
        array[2] = temp;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
