package annotations.practiceproblems.beginnerlevel.todo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Method;

class TodoTest {

    @Test
    void testTodoAnnotationExists() throws NoSuchMethodException {
        Method method = TaskManager.class.getMethod("validateLogin");
        assertTrue(method.isAnnotationPresent(Todo.class));
    }

    @Test
    void testDefaultPriorityValue() throws NoSuchMethodException {
        Method method = TaskManager.class.getMethod("optimizeQueries");
        Todo annotation = method.getAnnotation(Todo.class);
        assertEquals("MEDIUM", annotation.priority());
    }

    @Test
    void testAssignedToValue() throws NoSuchMethodException {
        Method method = TaskManager.class.getMethod("validateLogin");
        Todo annotation = method.getAnnotation(Todo.class);
        assertEquals("Alice", annotation.assignedTo());
    }
}
