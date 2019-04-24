package File_IO_Demo;

/*
* 字符流Writer Reader
* FileWriter FileReader
* 操作对象为一个字符Char
* */

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class CharStreamDemo {
    public static void main(String[] args) {
        File file = new File("demo.txt");
        if (!file.exists()){
            try {
                file.createNewFile();
                FileWriter fw = new FileWriter(file);
                for (int i = 0; i < 10 ; i++){
                    fw.write(i + "\thello world\r\n");
                }
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else {
            try {
                FileReader fr = new FileReader(file);
                char[] chars = new char[10];
                StringBuilder sb ;
                try {
                    sb = new StringBuilder();
                    while (fr.read(chars) != -1){
                        sb.append(chars);
                    }
                    System.out.println(sb);
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }finally {
                file.delete();
            }

        }
    }
}

