package ru.job4j.array;

import java.util.Arrays;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
            for (int j = 0; j <= pref.length - 1; j++) {
                if (word[j] != pref[j]) {
                    result = false;
                    break;
                }
            }
        return result;
    }
}
