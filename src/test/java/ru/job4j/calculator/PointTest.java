package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    public void when11to20then0() {
        int x1 = 1;
        int y1 = 1;
        int x2 = 1;
        int y2 = 1;
        double expected = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    public void when22to20then1() {
        int x1 = 1;
        int y1 = 0;
        int x2 = 0;
        int y2 = 1;
        double expected = 1.41;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    public void when33to20then4() {
        int x1 = 1;
        int y1 = 2;
        int x2 = 4;
        int y2 = 5;
        double expected = 4.24;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}