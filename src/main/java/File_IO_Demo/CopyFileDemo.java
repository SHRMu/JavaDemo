package File_IO_Demo;

import java.io.*;

public class CopyFileDemo {
    public static void main(String[] args) {
        copeFunc("java.jpg", "D:\\Github\\JavaDemo\\src\\result.jpg");
    }

    private static void copeFunc(String src, String target){
        File srcFile = new File(src);
        File targetFile = new File(target);

        if (srcFile.exists()){

            FileInputStream fis = null;
            FileOutputStream fos = null;

            try {
                fis = new FileInputStream(srcFile);
                fos = new FileOutputStream(targetFile);
                byte[] bytes = new byte[1024];
                int len = -1;
                try {
                    System.out.println("copy started ...");
                    while ((len = fis.read(bytes))!=-1){
                        fos.write(bytes,0,len);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }finally {
                try {
                    fis.close();
                    fos.close();
                    System.out.println("copy successfully !!!");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
