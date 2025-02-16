package reflection.intermediatelevel.annotation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AnnotationRetrieverTest {

    @Test
    public void testAuthorAnnotationExists() {
        assertTrue(Book.class.isAnnotationPresent(Author.class));
    }

    @Test
    public void testAuthorName() {
        Author author = Book.class.getAnnotation(Author.class);
        assertNotNull(author);
        assertEquals("John Doe", author.name());
    }

    @Test
    public void testInvalidAnnotation() {
        class UnrelatedClass {
        }
        assertFalse(UnrelatedClass.class.isAnnotationPresent(Author.class));
    }
}
