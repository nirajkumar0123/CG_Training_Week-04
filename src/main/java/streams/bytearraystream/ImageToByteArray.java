package streams.bytearraystream;

import java.io.*;

public class ImageToByteArray {
    // Convert Image File to Byte Array
    private static byte[] imageToByteArray(String filePath) throws IOException {
        try (FileInputStream fis = new FileInputStream(filePath);
             ByteArrayOutputStream baos = new ByteArrayOutputStream()) {

            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }
            return baos.toByteArray();
        }
    }

    // Convert Byte Array back to Image File
    private static void byteArrayToImage(byte[] imageBytes, String outputPath) throws IOException {
        try (FileOutputStream fos = new FileOutputStream(outputPath)) {
            fos.write(imageBytes);
        }
    }

    public static void main(String[] args) {
        String sourcePath = "src/main/java/streams/bytearraystream/image.png";
        String destinationPath = "src/main/java/streams/bytearraystream/imagetwo.png";
        try {
            byte[] imageBytes = imageToByteArray(sourcePath);
            byteArrayToImage(imageBytes, destinationPath);
            System.out.println("Image successfully copied.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
