package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }
    @Test
    public void whenMax1To3Then3() {
        int left = 1;
        int right = 2;
        int top = 3;
        int result = Max.max(left, right, top);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }
    @Test
    public void whenMax1To4Then4() {
        int left = 1;
        int right = 2;
        int top = 3;
        int bottom =4;
        int result = Max.max(left, right, top, bottom);
        int expected = 4;
        Assert.assertEquals(result, expected);
    }
}