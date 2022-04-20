package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {
    @Test
    public void whenP6K2Square2() {
        double expected = 2;
        double p = 6;
        double k = 2;
        double out = SqArea.squarea(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void whenP8K3Square3() {
        double expected = 3;
        double p = 8;
        double k = 3;
        double out = SqArea.squarea(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void whenP10K4Square4() {
        double expected = 4;
        double p = 10;
        double k = 4;
        double out = SqArea.squarea(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void whenP20K4Square16() {
        double expected = 16;
        double p = 20;
        double k = 4;
        double out = SqArea.squarea(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

}