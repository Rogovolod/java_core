package interview;

import org.junit.Test;

import static interview.SpacesBetweenString.refactorSpaces;
import static org.junit.Assert.assertEquals;

public class SpacesBetweenStringTest {

    @Test
    public void refactorSpacesCase1() {
        var testStr = "_abc_";
        var actual = refactorSpaces(testStr);
        assertEquals("a_b_c", actual);
    }

    @Test
    public void refactorSpacesCase2() {
        var testStr = "_abcd_";
        var actual = refactorSpaces(testStr);
        assertEquals("a_b_cd", actual);
    }

    @Test
    public void refactorSpacesCase3() {
        var testStr = "_a_bc_";
        var actual = refactorSpaces(testStr);
        assertEquals("a__b_c", actual);
    }

    @Test
    public void refactorSpacesCase4() {
        var testStr = "_abc___";
        var actual = refactorSpaces(testStr);
        assertEquals("a__b__c", actual);
    }

    @Test
    public void refactorSpacesCase5() {
        var testStr = "_a_b_c___";
        var actual = refactorSpaces(testStr);
        assertEquals( "a___b___c", actual);
    }

}