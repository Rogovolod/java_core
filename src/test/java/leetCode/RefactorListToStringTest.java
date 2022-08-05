package leetCode;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class RefactorListToStringTest {

    @Test
    public void combineTest() {
        List<String> listOf = Arrays.asList(null, "yuLia", "  ", "borjA", "Ceba", "", "aleNa", "daRek", "FranK", null, "yulia");
        String expected = "Alena - Borja - Ceba - Darek - Frank - Yulia";
        String actual = RefactorListToString.combine(listOf);
        assertEquals(expected, actual);
    }
}