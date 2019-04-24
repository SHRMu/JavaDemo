package File_IO_Demo;

import java.io.*;

public class ConversionStreamDemo {

    public static void main(String[] args) {
        try {
            InputStream in = new FileInputStream(new File("JavaDemo.iml"));
            StringBuilder sb = read(in);
            OutputStream out = new FileOutputStream(new File("result.iml"));
            write(out,sb);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void write(OutputStream out, StringBuilder sb){
        Writer writer = new OutputStreamWriter(out);
        try {
            writer.write(sb.toString());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static StringBuilder read(InputStream in){
        Reader reader = new InputStreamReader(in);
        char[] chars = new char[1024];
        int len = -1;
        StringBuilder sb = new StringBuilder();
        try {
            while((len=reader.read(chars)) != -1){
//                System.out.println(new String(chars,0,len));
                sb.append(new String(chars,0,len));
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb;
    }
}
