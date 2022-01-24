package ru.job4j.array;

public class EndsWith {
    public static boolean endWith(char[] word, char[] post) {
        boolean result = true;
        for (int i = 0; i < word.length; i++) {
            for (int j = 0; j < post.length; j++) {
                if (i == j && word[word.length - 1 - i] != post[post.length - 1 - j]) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}
