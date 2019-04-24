package Network_Demo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Socket_Demo {
    public static void main(String[] args) {
        DataOutputStream dos = null;
        DataInputStream dis = null;
        try {
            Socket client = new Socket("localhost", 8888);
            dos = new DataOutputStream(client.getOutputStream());
            Date date = Calendar.getInstance().getTime();
            DateFormat dt = new SimpleDateFormat("yyyy年MM月dd日\n");
            //write date in socket
            dos.write(dt.format(date).getBytes());
            dis = new DataInputStream(client.getInputStream());
            byte[] bytes =new byte[1024];
            dis.read(bytes);
            String str = new String(bytes);
            System.out.println(str);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (dis != null ){
                try {
                    dis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (dos != null ){
                try {
                    dos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

    }
}
