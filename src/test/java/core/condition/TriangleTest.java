package core.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    @Test
    public void whenExist() {
        boolean result = Triangle.exist(2.0, 2.0, 2.0);
        assertThat(result, is(true));
    }
    @Test
    public void whenNotExist() {
        boolean result = Triangle.exist(5.0, 2.0, 2.0);
        assertThat(result, is(false));
    }
}