package annotations.custom;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

class TaskInfoTest {

    @Test
    void testTaskInfoAnnotationExists() throws NoSuchMethodException {
        Method method = TaskManager.class.getMethod("completeTask");
        assertTrue(method.isAnnotationPresent(TaskInfo.class));
    }

    @Test
    void testTaskInfoPriorityValue() throws NoSuchMethodException {
        Method method = TaskManager.class.getMethod("completeTask");
        TaskInfo taskInfo = method.getAnnotation(TaskInfo.class);
        assertEquals("High", taskInfo.priority());
    }

    @Test
    void testTaskInfoAssignedToValue() throws NoSuchMethodException {
        Method method = TaskManager.class.getMethod("completeTask");
        TaskInfo taskInfo = method.getAnnotation(TaskInfo.class);
        assertEquals("John Doe", taskInfo.assignedTo());
    }
}
