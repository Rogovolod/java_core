package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class SqAreaTest {

    @Test
    public void whenPK62Then() {
        int in1 = 6;
        int in2 = 2;
        int expected = 2;
        double out = SqArea.square(in1, in2);
        Assert.assertEquals(expected, out, 0.000000000000001);
    }

}
