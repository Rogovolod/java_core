package core.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int rsl = Counter.sumByEven(1, 10);
        int expected = 30;
        assertThat(rsl, is(expected));
    }
    @Test
    public void whenSumEvenNumbersFromSevenToSeventen() {
        int rsl = Counter.sumByEven(7, 17);
        int expected = 60;
        assertThat(rsl, is(expected));
    }

@Test
public void whenSumNumbersFromSevenToSeventen() {
        int rsl = Counter.sum(7, 17);
        int expected = 132;
        assertThat(rsl, is(expected));
        }
        }