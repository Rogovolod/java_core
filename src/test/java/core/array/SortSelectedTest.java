package core.array;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class SortSelectedTest {
    @Test
    public void whenSort5() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertArrayEquals(result, expect);
    }
    @Test
    public void whenSort3() {
        int[] input = new int[] {3, 1, 2};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3};
        assertArrayEquals(result, expect);
    }
    @Test
    public void whenSort8() {
        int[] input = new int[] {7, 5, 6, 2, 8, 1, 3, 4};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
        assertArrayEquals(result, expect);
    }
}