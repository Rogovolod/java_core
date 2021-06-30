package net;

import java.io.IOException;
import java.net.URL;

public class Url {
    public static void main(String[] args) throws IOException {
        var url = new URL("http://www.google.com");
        System.out.println("Протокол: " + url.getProtocol());
        System.out.println("Порт: " + url.getPort());
        System.out.println("Хост: " + url.getHost());
        System.out.println("Файл: " + url.getFile());
        System.out.println("Полная форма: " + url.toExternalForm());
        var urlc = url.openConnection();
    }
}
