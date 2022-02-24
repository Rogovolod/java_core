package core.encrypt;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

/**
* There are two variants about core.encrypt SHA-256
**/

public class SHA256 {


    /**
     * The first and shortest
     * also we can use another core.encrypt right there
     **/
    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        MessageDigest m = MessageDigest.getInstance("SHA-256"); // just change getInstance("SHA-256") to getInstance("MD5")
        m.reset();
        m.update(s.getBytes());
        for (byte i : m.digest()) {
            System.out.print(String.format("%02x", i));
        }
        System.out.println();

        /**
         * The second way use core.function bytesToHex(byte[] hash)
         * recommended by
         * https://www.baeldung.com/sha-256-hashing-java
         * @var s - is input from System.in
         **/

        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] encodedhash = digest.digest(s.getBytes(StandardCharsets.UTF_8));
        System.out.println(SHA256.bytesToHex(encodedhash));

        input.close();

    }

    public static String bytesToHex(byte[] hash) {
        StringBuilder hexString = new StringBuilder(2 * hash.length);
        for (int i = 0; i < hash.length; i++) {
            String hex = Integer.toHexString(0xff & hash[i]);
            if (hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }
        return hexString.toString();
    }


}
