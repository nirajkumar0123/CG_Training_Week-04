package exceptions.trywithresources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AutoClosingResources {
    public static void main(String[] args) {
        String filePath = "src/main/java/exceptions/trywithresources/info.txt";

        try (FileReader fileReader = new FileReader(filePath);
             BufferedReader br = new BufferedReader(fileReader)) {

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}
