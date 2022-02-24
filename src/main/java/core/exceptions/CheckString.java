package core.exceptions;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class CheckString {

    public static void main(String[] args) throws IOException {
        var file = new File("test.csv");
        var a = new ArrayList<Long>();
        long i = 0;
        while (true) {
            i++;
            a.add(i);
            FileOutputStream fos = new FileOutputStream(file, true);
                String text = String.valueOf(i);
                byte[] buffer = text.getBytes();
                fos.write(buffer);

        }
    }

}
