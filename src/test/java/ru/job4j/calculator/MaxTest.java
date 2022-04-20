package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
    @Test
    public void whenMax1To2then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(1, 2);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }
    @Test
    public void whenMax2To1then2() {
        int left = 2;
        int right = 1;
        int result = Max.max(2, 1);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }
    @Test
    public void whenMax3To3then2() {
        int left = 3;
        int right = 3;
        int result = Max.max(3, 3);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }
}