package http;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.atomic.AtomicBoolean;

public class SendMultipleHttpRequest {

    public static void main(String[] args) throws Exception { // in the pipeline

        for (int i = 0; i < 5; i++) { // 5 http requests to example http
            MultipleThreadRequest thread = new MultipleThreadRequest();
            thread.start();
        }

    }

    public static class MultipleThreadRequest extends Thread {

        private AtomicBoolean running = new AtomicBoolean(true);
        private final String request = "https://www.igogo.gnom/"; // example http
        private final URL url;

        String param = null;

        public MultipleThreadRequest() throws Exception {
            url = new URL(request);
            param = "param1=" + URLEncoder.encode("87845", StandardCharsets.UTF_8);
        }

        @Override
        public void run() {
            while (running.get()) {
                try {
                    sentHttp();
                } catch (Exception e) {
                    e.getStackTrace();
                }
            }
        }

        public void sentHttp() throws Exception {
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

}