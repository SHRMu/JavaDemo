package File_IO_Demo;

import java.io.*;
import java.util.concurrent.Callable;

public class BufferedStreamDemo {

    public static void main(String[] args) {
        File file = new File("java.jpg");
        File result = new File("result.jpg");

        InputStream in = null;
        OutputStream out = null;
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try {
            in= new FileInputStream(file);
            bis = new BufferedInputStream(in);
            out = new FileOutputStream(result);
            bos = new BufferedOutputStream(out);
            byte[] bytes = new byte[1024];
            int len = -1;
            while((len = bis.read(bytes))!= -1){
                bos.write(bytes,0,len);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
                out.close();
                bis.close();
                bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
