package reflection.basiclevel.classinfo;

import org.junit.jupiter.api.Test;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import static org.junit.jupiter.api.Assertions.*;

public class ClassInfoRetrieverTest {

    @Test
    public void testClassExists() throws ClassNotFoundException {
        Class<?> clazz = Class.forName("java.lang.String");
        assertNotNull(clazz);
    }

    @Test
    public void testMethodRetrieval() throws ClassNotFoundException {
        Class<?> clazz = Class.forName("java.lang.String");
        Method[] methods = clazz.getDeclaredMethods();
        assertTrue(methods.length > 0);
    }

    @Test
    public void testFieldRetrieval() throws ClassNotFoundException {
        Class<?> clazz = Class.forName("java.lang.System");
        Field[] fields = clazz.getDeclaredFields();
        assertTrue(fields.length > 0);
    }
}
