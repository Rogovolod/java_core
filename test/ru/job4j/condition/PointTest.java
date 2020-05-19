package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;
import ru.job4j.converter.Converter;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PointTest {
    @Test
    public void whenDistance7006Then() {
        Point one = new Point(1, 0, 0);
        Point two = new Point(0, 5, 4);
        double result = one.distance3d(two);
        Assert.assertEquals(result, 6.48,  0.01);
    }
}
