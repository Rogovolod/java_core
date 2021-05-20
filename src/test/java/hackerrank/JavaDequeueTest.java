package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class JavaDequeueTest {

    @Test
    public void whenStoringInFileTooLongString() throws IOException {
        FileInputStream fis = new FileInputStream("src/test/resources/stringtoolong.txt");
        var j = new JavaDequeue();
        assertThat((j.arrayDeq(fis)), is(94055));
    }

}
