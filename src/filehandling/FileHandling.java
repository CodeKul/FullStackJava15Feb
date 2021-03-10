package filehandling;

import java.io.*;

public class FileHandling {

    public static void main(String[] args) throws IOException {

            FileOutputStream fileOutputStream = new FileOutputStream("/home/vaibhav/workspace/FullStackJava15FEB/src/filehandling/FHDemo.txt");
            String s = "Today is Tuesday";
            byte[] arr = s.getBytes();
            fileOutputStream.write(arr);

            System.out.println("File write successfully....");



            FileInputStream  fileInputStream = new FileInputStream("FHDemo.txt");
            int i = fileInputStream.read();
            System.out.println(i);


            while (i>0){
                System.out.print((char)i);

                i= fileInputStream.read();
            }
//
    }
}
