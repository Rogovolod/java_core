package core.array;

import org.junit.Assert;
import org.junit.Test;

public class SecondLargestTest {

    @Test
    public void whenOneMaxTest() {
        int[] numbers = {4, 5, 7, 2, 4, 9, 54, 34, 5, 43};
        int result = SecondLargest.findSecondMaxNumber(numbers);
        int expected = 43;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSeveralMaxTest() {
        int[] numbers = {9, 9, 7, 9, 4, 3, 2, 1, 0, 5};
        int result = SecondLargest.findSecondMaxNumber(numbers);
        int expected = 7;
        Assert.assertEquals(expected, result);
    }

}
