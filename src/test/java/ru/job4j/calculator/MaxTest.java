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
}