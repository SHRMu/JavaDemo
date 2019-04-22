package Network_Demo;

import java.io.IOException;
import java.net.*;

public class UDP_Server_Demo {
    public static void main(String[] args) {
        String hello = "Hello";
        byte[] bytes = hello.getBytes();
        try {
            DatagramPacket dp = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("localhost"), 10001);
            DatagramSocket ds = new DatagramSocket(9001);
            ds.send(dp);
            ds.receive(dp);
            String echo = new String(dp.getData());
            System.out.println(echo);



        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
