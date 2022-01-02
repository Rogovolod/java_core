package leetCode;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TwoSumTest {

    @Test
    public void twoSumTest1() {
        int[] result = TwoSum.twoSum(new int[] {2, 7, 11, 15}, 9);
        int[] expected = new int[] {0, 1};
        assertArrayEquals(expected, result);
    }

    @Test
    public void twoSumTest2() {
        int[] result = TwoSum.twoSum(new int[] {3, 2, 4, 15}, 6);
        int[] expected = new int[] {1, 2};
        assertArrayEquals(expected, result);
    }

    @Test
    public void twoSumTest3() {
        int[] result = TwoSum.twoSum(new int[] {3, 3}, 6);
        int[] expected = new int[] {0, 1};
        assertArrayEquals(expected, result);
    }

    @Test
    public void twoSumTest4() {
        int[] result = TwoSum.twoSum(new int[] {3, 2, 3}, 6);
        int[] expected = new int[] {0, 2};
        assertArrayEquals(expected, result);
    }


}
