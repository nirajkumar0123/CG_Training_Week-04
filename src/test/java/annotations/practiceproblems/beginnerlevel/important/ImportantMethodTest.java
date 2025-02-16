package annotations.practiceproblems.beginnerlevel.important;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Method;

class ImportantMethodTest {

    @Test
    void testImportantMethodAnnotationExists() throws NoSuchMethodException {
        Method method = CriticalOperations.class.getMethod("processPayment");
        assertTrue(method.isAnnotationPresent(ImportantMethod.class));
    }

    @Test
    void testDefaultLevelValue() throws NoSuchMethodException {
        Method method = CriticalOperations.class.getMethod("processPayment");
        ImportantMethod annotation = method.getAnnotation(ImportantMethod.class);
        assertEquals("HIGH", annotation.level());
    }

    @Test
    void testCustomLevelValue() throws NoSuchMethodException {
        Method method = CriticalOperations.class.getMethod("generateReport");
        ImportantMethod annotation = method.getAnnotation(ImportantMethod.class);
        assertEquals("MEDIUM", annotation.level());
    }
}
