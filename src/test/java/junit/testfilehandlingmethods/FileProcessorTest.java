package junit.testfilehandlingmethods;

import org.junit.jupiter.api.*;
import java.io.*;
import java.nio.file.*;

import static org.junit.jupiter.api.Assertions.*;

class FileProcessorTest {
    private final FileProcessor fileProcessor = new FileProcessor();
    private static final String TEST_FILE = "testfile.txt";

    @BeforeEach
    void setup() throws IOException {
        Files.deleteIfExists(Paths.get(TEST_FILE)); // Clean up before each test
    }

    @Test
    void testWriteAndReadFromFile() throws IOException {
        String content = "Hello, JUnit!";

        // Write to file
        fileProcessor.writeToFile(TEST_FILE, content);

        // Read from file
        String readContent = fileProcessor.readFromFile(TEST_FILE);

        assertEquals(content, readContent, "Content should be the same as written.");
    }

    @Test
    void testFileExistsAfterWriting() throws IOException {
        fileProcessor.writeToFile(TEST_FILE, "Sample content");
        assertTrue(Files.exists(Paths.get(TEST_FILE)), "File should exist after writing.");
    }

    @Test
    void testReadNonExistentFileThrowsException() {
        Exception exception = assertThrows(IOException.class, () -> fileProcessor.readFromFile("nonexistent.txt"));
        assertNotNull(exception.getMessage(), "Exception message should not be null.");
    }

    @AfterEach
    void cleanup() throws IOException {
        Files.deleteIfExists(Paths.get(TEST_FILE)); // Clean up after each test
    }
}
