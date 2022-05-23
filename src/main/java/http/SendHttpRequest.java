package http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class SendHttpRequest {

    public static void createRequest() throws IOException {
        URL url = new URL("https:www.example.com");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setInstanceFollowRedirects(false);

        int status = connection.getResponseCode();
/*        if (status == HttpURLConnection.HTTP_MOVED_TEMP
                || status == HttpURLConnection.HTTP_MOVED_PERM) {
            String location = connection.getHeaderField("Location");
            URL newUrl = new URL(location);
            connection = (HttpURLConnection) newUrl.openConnection();
        }*/

        BufferedReader in = new BufferedReader(
                new InputStreamReader(connection.getInputStream()));
        String inputLine;
        StringBuffer content = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }
        in.close();
        connection.disconnect();
        System.out.println(status);
//        System.out.println(content);

    }

    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 2000; i++) {
            createRequest();
        }
        createRequest();

    }

}
