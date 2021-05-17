package live;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class JavaStackTest {

    @Test
    public void javaStackTest() {
        String rsl = "({}[])\n" +
                "(({()})))\n" +
                "({(){}()})()({(){}()})(){()}\n" +
                "{}()))(()()({}}{}\n" +
                "}}}}\n" +
                "))))\n" +
                "{{{\n" +
                "(((\n" +
                "[]{}(){()}((())){{{}}}{()()}{{}{}}\n" +
                "[[]][][]\n" +
                "}{";
        String exp = "true\n" +
                "false\n" +
                "true\n" +
                "false\n" +
                "false\n" +
                "false\n" +
                "false\n" +
                "false\n" +
                "true\n" +
                "true\n" +
                "false";

        assertThat(exp, is(JavaStack.javaStack(rsl)));
    }

}
