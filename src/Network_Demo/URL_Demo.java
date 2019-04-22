package Network_Demo;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class URL_Demo {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://i.stack.imgur.com/OAzeV.jpg");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            BufferedInputStream bis = new BufferedInputStream(conn.getInputStream());
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("java_udp.jpg"));
            byte[] bytes = new byte[1024];
            int len = -1;
            while ((len = bis.read(bytes))!= -1){
                bos.write(bytes, 0, bytes.length);
                bos.flush();
            }
            bis.close();
            bos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
