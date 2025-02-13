package streams.consoleinput;

import java.io.*;

public class UserInputReader {
    public static void main(String[] args) {
        String fileName = "src/main/java/streams/consoleinput/test_user_data.txt";

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileWriter writer = new FileWriter(fileName, true)) {

            System.out.print("Enter your name: ");
            String name = reader.readLine();

            System.out.print("Enter your age: ");
            int age = Integer.parseInt(reader.readLine());

            System.out.print("Enter your favorite programming language: ");
            String language = reader.readLine();

            writer.write("Name: " + name + ", Age: " + age + ", Language: " + language + "\n");
            writer.close();
            System.out.println("Data saved successfully to " + fileName);

        } catch (IOException e) {
            System.out.println("Error reading input or writing to file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid age format. Please enter a number.");
        }
    }
}

