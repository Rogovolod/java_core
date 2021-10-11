package base64;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;
import java.util.Scanner;

public class Base64Decoder {

    public static void main(String[] args) throws IOException {

        var fis = new FileInputStream("src/main/java/base64/filesForDecoding/Base64TextForDecoding.txt");
        var base64Text = new Scanner(fis).nextLine().split(",")[1];
        fis.close();

        byte[] decodedBytes = Base64.getDecoder().decode(base64Text);

        var outputStream = new FileOutputStream("src/main/java/base64/decodedFiles/decoded");
        outputStream.write(decodedBytes);
        outputStream.close();

    }

}
