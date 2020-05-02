package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class PointTest {

    @Test
    public void whenDistance7006Then() {
        int in1 = 3;
        int in2 = 0;
        int in3 = 0;
        int in4 = 3;
        double expected = 4.24;
        double out = Point.distance(in1, in2, in3, in4);
        Assert.assertEquals(expected, out, 0.01);
    }
}
