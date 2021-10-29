import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    private static final char[] HEX_ARRAY = "0123456789ABCDEF".toCharArray();

    public static String bytesToHex(byte[] bytes) {
        char[] hexChars = new char[bytes.length * 2];
        for (int j = 0; j < bytes.length; j++) {
            int v = bytes[j] & 0xFF;
            hexChars[j * 2] = HEX_ARRAY[v >>> 4];
            hexChars[j * 2 + 1] = HEX_ARRAY[v & 0x0F];
        }
        return new String(hexChars);
    }

    public static void main(String[] args) throws IOException {
        var currentMonthAndYear = LocalDateTime.now().format(DateTimeFormatter.ofPattern("LLLL yyyy", new Locale("ru")));
//        System.out.println(currentMonthAndYear);
//        var old = new File("testText.txt");
//        var newF = new File("Text.txt");
        var test = new  File("application.docx");
        byte[] fileContent = Files.readAllBytes(test.toPath());

//       var f = new File(bytesToHex(fileContent));

        try (FileOutputStream fos = new FileOutputStream("testFile")) {
            fos.write(fileContent);
            //fos.close(); There is no more need for this line since you had created the instance of "fos" inside the try. And this will automatically close the OutputStream
        }


    }
}

