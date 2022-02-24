package core.converter;

import org.junit.Test;

import org.junit.Assert;


public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert120RblThen2Dlr() {
        int in2 = 120;
        int expected2 = 2;
        int out2 = Converter.rubleToDollar(in2);
        Assert.assertEquals(expected2, out2);
    }

    @Test
    public void whenConvert1040RblThen100RMB() {
        int in3 = 1000;
        int expected3 = 100;
        int out3 = Converter.rubleToRMB(in3);
        Assert.assertEquals(expected3, out3);
    }

    @Test
    public void whenConvert1000RblThen690JPY() {
        int in4 = 1000;
        int expected4 = 500;
        int out4 = Converter.rubleToJPY(in4);
        Assert.assertEquals(expected4, out4);
    }
}