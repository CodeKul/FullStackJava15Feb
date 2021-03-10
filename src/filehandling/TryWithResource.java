package filehandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TryWithResource {

    public static void main(String[] args) {

        try (FileWriter fileWriter = new FileWriter("FHDemo2.txt")) {
            fileWriter.write("Today is Wednesday");

            System.out.println("File write successfully..");

        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

        try (FileReader fileReader = new FileReader("FHDemo2.txt")) {
            int i = fileReader.read();
            System.out.println(i);
            while (i > 0) {
                System.out.println((char) i);
                i = fileReader.read();
            }

        } catch (IOException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
    }

}
