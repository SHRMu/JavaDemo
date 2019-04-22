package Network_Demo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDP_Client_Demo {
    public static void main(String[] args) {
        try {
            byte[] bytes = new byte[1024];
            DatagramPacket dp = new DatagramPacket(bytes, 1024);
            DatagramSocket ds = new DatagramSocket(10001);
            ds.receive(dp);
            String Info = new String(dp.getData());
            System.out.println(Info);

            dp.setAddress(InetAddress.getLocalHost());
            dp.setData("Echo".getBytes());
            dp.setPort(9001);
            ds.send(dp);

            ds.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
