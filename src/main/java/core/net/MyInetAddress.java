package core.net;

import java.net.*;

public class MyInetAddress {

    public static void main(String[] args) throws UnknownHostException {
        var address = InetAddress.getLocalHost(); // класс InetAddress позволяет оперировать IP
        System.out.println(address);
        address = InetAddress.getByName("www.job4j.com");
        System.out.println(address);
        InetAddress sw[] = InetAddress.getAllByName("www.google.com");
        for (int i = 0; i < sw.length; i++) {
            System.out.println(sw[i]);
        }

    }

}
