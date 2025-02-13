package streams.bufferedstreams;

import java.io.*;

public class BufferedStream {
    private static final int BUFFER_SIZE = 4096;

    public static void main(String[] args) {
        String sourceFile = "src/main/java/streams/bufferedstreams/source.txt";
        String bufferedDestination = "src/main/java/streams/bufferedstreams/buffereddestination.txt";
        String unbufferedDestination = "src/main/java/streams/bufferedstreams/unbuffereddestination.txt";

        long bufferedTime = copyFileWithBuffering(sourceFile, bufferedDestination);
        long unbufferedTime = copyFileWithoutBuffering(sourceFile, unbufferedDestination);

        System.out.println("\n Performance Comparison:");
        System.out.println("Buffered Streams:   " + bufferedTime + " ns");
        System.out.println("Unbuffered Streams: " + unbufferedTime + " ns");
    }

    public static long copyFileWithBuffering(String sourceFile, String destinationFile) {
        File source = new File(sourceFile);
        if (!source.exists()) {
            System.out.println("Source file does not exist!");
            return -1;
        }

        long startTime = System.nanoTime();

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceFile));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destinationFile))) {

            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
            bos.flush();
            System.out.println("File copied successfully using Buffered Streams.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return System.nanoTime() - startTime;
    }

    public static long copyFileWithoutBuffering(String sourceFile, String destinationFile) {
        File source = new File(sourceFile);
        if (!source.exists()) {
            System.out.println("Source file does not exist!");
            return -1;
        }

        long startTime = System.nanoTime();

        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destinationFile)) {

            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }
            System.out.println("File copied successfully using Unbuffered Streams.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return System.nanoTime() - startTime;
    }
}


