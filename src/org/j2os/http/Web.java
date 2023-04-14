package org.j2os.http;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class Web {
    private Web(){}
    public static String sendRequestByGet(String requestAddress) throws Exception {
        URL url = new URL(requestAddress);
        URLConnection connection = url.openConnection();
        InputStream inputStream = connection.getInputStream();
        int ascii = inputStream.read();
        String content = "";
        while (ascii != -1) {
            content += (char) ascii;
            ascii = inputStream.read();
        }
        inputStream.close();
        return content;
    }
}
