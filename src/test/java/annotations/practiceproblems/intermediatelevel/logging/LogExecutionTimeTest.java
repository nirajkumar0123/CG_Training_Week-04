package annotations.practiceproblems.intermediatelevel.logging;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

class LogExecutionTimeTest {

    @Test
    void testLogExecutionTimeAnnotationExists() throws NoSuchMethodException {
        Method method = TaskProcessor.class.getMethod("performHeavyTask");
        assertTrue(method.isAnnotationPresent(LogExecutionTime.class));
    }

    @Test
    void testExecutionTimeMeasurement() {
        TaskProcessor processor = new TaskProcessor();
        long start = System.nanoTime();
        processor.performHeavyTask();
        long end = System.nanoTime();
        assertTrue((end - start) > 0);
    }

    @Test
    void testNonAnnotatedMethod() throws NoSuchMethodException {
        Method method = TaskProcessor.class.getMethod("normalTask");
        assertFalse(method.isAnnotationPresent(LogExecutionTime.class));
    }
}
