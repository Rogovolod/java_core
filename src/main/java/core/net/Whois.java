package core.net;

import java.net.Socket;

public class Whois {

    public static void main(String[] args) throws Exception {
        int c;

        /**
         * создать сокетное соединение с
         * веб сайтом internic.core.net через порт 43
         * невероятно старый протокол whois
         */
        var s = new Socket("whois.internic.core.net", 43);
        //получить потоки ввода-вывода
        var in = s.getInputStream();
        var out = s.getOutputStream();
        //сформировать строку запроса
        var str = "google.com\n";
        //преобразуем эту строку в байты
        byte buf[] = str.getBytes();
        //послать запрос
        out.write(buf);
        //прочитать ответ и вывести на экран
        while ((c = in.read()) != -1) {
            System.out.print((char) c);
        }
        s.close();
    }

}
