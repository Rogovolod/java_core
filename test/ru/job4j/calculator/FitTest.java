package ru.job4j.calculator;

import org.junit.Test;

import org.junit.Assert;

public class FitTest {

    @Test
    public void manWeight() {
        double in = 182;
        double expected = 94.3;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void womenWeight() {
        double in2 = 162;
        double expected2 = 59.8;
        double out2 = Fit.womanWeight(in2);
        Assert.assertEquals(expected2, out2, 0.01);
    }
}