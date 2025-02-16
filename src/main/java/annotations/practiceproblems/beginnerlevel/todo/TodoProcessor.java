package annotations.practiceproblems.beginnerlevel.todo;

import java.lang.reflect.Method;

public class TodoProcessor {
    public static void main(String[] args) {
        Method[] methods = TaskManager.class.getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(Todo.class)) {
                Todo annotation = method.getAnnotation(Todo.class);
                System.out.println("Task: " + annotation.task());
                System.out.println("Assigned To: " + annotation.assignedTo());
                System.out.println("Priority: " + annotation.priority());
                System.out.println("Method: " + method.getName());
                System.out.println("------------------------");
            }
        }
    }
}

