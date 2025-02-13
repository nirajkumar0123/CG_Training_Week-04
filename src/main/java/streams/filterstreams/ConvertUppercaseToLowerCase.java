package streams.filterstreams;

import java.io.*;

public class ConvertUppercaseToLowerCase {
    public static void copyFile(String source, String destination) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(source));
             BufferedWriter writer = new BufferedWriter(new FileWriter(destination))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line.toLowerCase());
                writer.newLine();
            }
            System.out.println("File copied successfully.");
        }
    }

    public static void main(String[] args) {
        String source = "src/main/java/streams/filterstreams/source.txt";
        String destination = "src/main/java/streams/filterstreams/destination.txt";
        try {
            copyFile(source, destination);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
