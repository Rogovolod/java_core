package array;

import arrays.SwitchArray;
import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SwitchArrayTest {

    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int[] expect = {4, 2, 3, 1};
        int[] rsl = SwitchArray.swap(input, 0, input.length - 1);
        assertThat(rsl, is(expect));
    }
    @Test
    public void whenSwap0to4() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expect = {5, 2, 3, 4, 1};
        int[] rsl = SwitchArray.swap(input, 0, input.length - 1);
        assertThat(rsl, is(expect));
    }
    @Test
    public void whenSwap0to7() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] expect = {8, 2, 3, 4, 5, 6, 7, 1};
        int[] rsl = SwitchArray.swap(input, 0, input.length - 1);
        assertThat(rsl, is(expect));
    }
    @Test
    public void whenSwap0t4() {
        int[] input = {0, 1, 2, 3};
        int[] expect = {0, 2, 1, 3};
        int[] rsl = SwitchArray.swap(input, 1, 2);
        assertThat(rsl, is(expect));
    }
}