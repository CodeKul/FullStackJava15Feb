package filehandling;

import java.io.*;

public class FileReaderAndWriter {
    public static void main(String[] args) {

        FileWriter fileWriter = null;
        FileReader fileReader = null;

        try {
            fileWriter = new FileWriter("FHDemo1.txt");
            fileWriter.write("Toda1y is4 Wednesday 45");

            System.out.println("File write successfully..");

        } catch (IOException ioException) {
            ioException.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }


        try {
            fileReader = new FileReader("FHDemo1.txt");
            int i = fileReader.read();

            while (i > 0) {

//                for(int i =48;i<=57;i++){
//
//                }
                if (Character.isDigit((char) i)) {
                    System.out.println((char) i);
                }
                i = fileReader.read();
            }

        } catch (IOException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }

    }

}
