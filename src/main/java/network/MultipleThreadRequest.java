package network;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.atomic.AtomicBoolean;

public class MultipleThreadRequest extends Thread {

    private final AtomicBoolean running = new AtomicBoolean(true);
    private final URL url;

    private final String param;

    public MultipleThreadRequest(String request) throws Exception {
        url = new URL(request);
        param = "param1=" + URLEncoder.encode("87845", StandardCharsets.UTF_8);
    }

    @Override
    public void run() {
        while (running.get()) {
            try {
                sendHttp();
            } catch (Exception e) {
                e.getStackTrace();
            }
        }
    }

    public void sendHttp() throws Exception {
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setDoOutput(true);
        connection.setDoInput(true);
        connection.setRequestMethod("POST");
        connection.setRequestProperty("Host", "localhost");
        connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:8.0) Gecko/20100101 Firefox/8.0");
        connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        connection.setRequestProperty("Content-Length", param);
        System.out.println(this + " " + connection.getResponseCode());
        connection.getInputStream();
    }
}
