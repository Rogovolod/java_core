package leetCode;

import org.junit.Assert;
import org.junit.Test;

public class ValidParenthesesTest {

    private final ValidParentheses validParentheses = new ValidParentheses();

    @Test
    public void isValid1() {
        Assert.assertTrue(validParentheses.isValid("()"));
    }

    @Test
    public void isValid2() {
        Assert.assertTrue(validParentheses.isValid("()[]{}"));
    }

    @Test
    public void isValid3() {
        Assert.assertFalse(validParentheses.isValid("(]"));
    }

    @Test
    public void isValid4() {
        Assert.assertFalse(validParentheses.isValid("([)]"));
    }
}