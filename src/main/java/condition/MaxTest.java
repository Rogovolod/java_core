package condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }
    @Test
    public void whenMax2To1Then2() {
        int result = Max.max(2, 1);
        assertThat(result, is(2));
    }
    @Test
    public void whenMax2To2Then2() {
        int result = Max.max(2, 2);
        assertThat(result, is(2));
    }
    @Test
    public void whenMax3To1Then3() {
        int result = Max.max(1, 2, 3);
        assertThat(result, is(3));
    }
    @Test
    public void whenMax2To1Then3() {
        int result = Max.max(2, 3, 1);
        assertThat(result, is(3));
    }
    @Test
    public void whenMax2to2Equal() {
        int result = Max.max(2, 2, 2);
        assertThat(result, is(2));
    }
    @Test
    public void whenMax1To4Then4() {
        int result = Max.max(1, 2, 3, 4);
        assertThat(result, is(4));
    }
    @Test
    public void whenMax4To1Then4() {
        int result = Max.max(4, 3, 2, 1);
        assertThat(result, is(4));
    }
    @Test
    public void whenMax7Equal() {
        int result = Max.max(7, 7, 7, 7);
        assertThat(result, is(7));
    }
    @Test
    public void whenMax3To5Then9() {
        int result = Max.max(3, 9, 9, 5);
        assertThat(result, is(9));
    }
}