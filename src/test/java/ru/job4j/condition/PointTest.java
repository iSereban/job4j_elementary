package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        Point a = new Point(x1, y1);
        Point b = new Point(x2, y2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when12to21then1dot41() {
        double expected = 1.41;
        int x1 = 1;
        int y1 = 2;
        int x2 = 2;
        int y2 = 1;
        Point a = new Point(x1, y1);
        Point b = new Point(x2, y2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when45to12then4dot24() {
        double expected = 4.24;
        int x1 = 4;
        int y1 = 5;
        int x2 = 1;
        int y2 = 2;
        Point a = new Point(x1, y1);
        Point b = new Point(x2, y2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

}