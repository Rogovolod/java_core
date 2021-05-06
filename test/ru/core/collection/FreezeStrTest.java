package ru.core.collection;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class FreezeStrTest {

    @Test
    public void whenEq() {
        assertThat(FreezeStr.eqSort("Hello", "Hlloe"), is(true));
        assertThat(FreezeStr.eqHashMap("Hello", "Hlloe"), is(true));
        assertThat(FreezeStr.eq("Hello", "Hlloe"), is(true));
    }

    @Test
    public void whenNotEq() {
        assertThat(FreezeStr.eqSort("Hello", "Halle"), is(false));
        assertThat(FreezeStr.eqHashMap("Hello", "Halle"), is(false));
        assertThat(FreezeStr.eq("Hello", "Halle"), is(false));
    }

    @Test
    public void whenNotMultiEq() {
        assertThat(FreezeStr.eqSort("heloo", "hello"), is(false));
        assertThat(FreezeStr.eqHashMap("heloo", "hello"), is(false));
        assertThat(FreezeStr.eq("heloo", "hello"), is(false));
    }
}