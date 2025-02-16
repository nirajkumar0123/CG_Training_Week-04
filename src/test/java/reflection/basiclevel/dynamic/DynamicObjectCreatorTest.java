package reflection.basiclevel.dynamic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Constructor;

public class DynamicObjectCreatorTest {

    @Test
    void testCreateStudentInstance() throws Exception {
        Class<?> studentClass = Class.forName("reflection.basiclevel.dynamic.Student");
        Object studentInstance = studentClass.getDeclaredConstructor().newInstance();

        assertNotNull(studentInstance);
        assertTrue(studentInstance instanceof Student);
    }

    @Test
    void testCreateStudentWithParams() throws Exception {
        Class<?> studentClass = Class.forName("reflection.basiclevel.dynamic.Student");
        Constructor<?> constructor = studentClass.getDeclaredConstructor(String.class, int.class);
        Object studentInstance = constructor.newInstance("John Doe", 25);

        assertNotNull(studentInstance);
        assertTrue(studentInstance instanceof Student);

        Student student = (Student) studentInstance;
        assertEquals("John Doe", student.getName());
        assertEquals(25, student.getAge());
    }
}

