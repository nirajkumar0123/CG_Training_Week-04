package streams.filehandling;

import java.io.*;

public class FileReaderWriter {
    public static void copyFile(String source, String destination) {
        File srcFile = new File(source);
        if (!srcFile.exists()) {
            System.out.println("Source file does not exist!");
            return;
        }

        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(destination)) {

            byte[] buffer = new byte[4096]; // Read in chunks of 4KB
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("Error during file copy: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String source = "src/main/java/streams/filehandling/source.txt";
        String destination = "src/main/java/streams/filehandling/destination.txt";
        copyFile(source, destination);
    }
}
