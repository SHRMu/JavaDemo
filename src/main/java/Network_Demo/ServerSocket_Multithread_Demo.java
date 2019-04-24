package Network_Demo;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ServerSocket_Multithread_Demo {
    public static void main(String[] args) {
        //建立线程池，固定三个线程数
        ExecutorService es = Executors.newFixedThreadPool(3);
        try {
            ServerSocket server = new ServerSocket(8888);
            while (true){
                Socket client = server.accept();
                System.out.println("有新的客户级连接："+ client.getLocalAddress());
                es.execute(new ClientHandler(client)); //启动线程池中的线程
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

class ClientHandler implements Runnable{
    private Socket client;

    public ClientHandler(Socket socket) {
        this.client = socket;
    }

    @Override
    public void run() {
        try {
//            DataInputStream dis = new DataInputStream(client.getInputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));

//            byte[] bytes = new byte[1024];
//            dis.read(bytes);

            String info = br.readLine();
            System.out.println("Client : " + info);

            bw.write("Echo : " + info + "\n");
            bw.flush();

            br.close();
            bw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
