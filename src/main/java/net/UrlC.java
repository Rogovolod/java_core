package net;

import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.Date;

public class UrlC {
    public static void main(String[] args) throws Exception {
        int c;
        var hp = new URL("http://www.internic.net");
        var hpCon = hp.openConnection();
        //get data
        var d = hpCon.getDate();
        if(d == 0) {
            System.out.println("There are no data");
        } else {
            System.out.println("Date: " + new Date(d));
        }
        //get content type
        System.out.println("Content type: " + hpCon.getContentType());

        System.out.println(new Date(hpCon.getExpiration()));
        long len = hpCon.getContentLengthLong();
        if (len != 0) {
            System.out.println("==========");
            var input = hpCon.getInputStream();
            while ((c = input.read()) != -1) {
                System.out.print((char) c);
            }
        }
    }
}
