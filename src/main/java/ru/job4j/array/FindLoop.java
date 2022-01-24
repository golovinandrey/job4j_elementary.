package ru.job4j.array;

public class FindLoop {
    public static int indexof(int[] data, int el) {
        int rst = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el) {
                rst = i;
                break;
            }
        }
        return rst;
    }

    public static int indexOf(int[] data, int el, int start, int finish) {
        int rsl = -1;
        for (int i = 0; i < data.length - 1; i++) {
            if (data[start] >= data[i] && data[i] <= data[finish] && data[i] == el) {
                rsl = i;
            }
        }
        return rsl;
    }
}
