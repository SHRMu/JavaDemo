package Network_Demo;

/*
* Socket 是 网络驱动层 提供给应用程序编程的 接口和一种机制
*
* */

import javax.print.DocFlavor;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocket_Demo {
    public static void main(String[] args) {
        DataInputStream dis = null;
        DataOutputStream dos = null;
        try {
            ServerSocket server = new ServerSocket(10000);

            Socket client = server.accept();
            dis = new DataInputStream(client.getInputStream());
            byte[] bytes = new byte[10240];
            dis.read(bytes);
            dos = new DataOutputStream(client.getOutputStream());
            String str = new String(bytes);
            System.out.println(str);
            dos.write(("Echo : " + str).getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (dis != null) {
                try {
                    dis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (dos != null) {
                try {
                    dos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
