package annotations.practiceproblems.beginnerlevel.todo;

public class TaskManager {

    @Todo(task = "Implement login validation", assignedTo = "Alice", priority = "HIGH")
    public void validateLogin() {
        System.out.println("Validating login...");
    }

    @Todo(task = "Optimize database queries", assignedTo = "Bob")
    public void optimizeQueries() {
        System.out.println("Optimizing queries...");
    }

    @Todo(task = "Refactor UI components", assignedTo = "Charlie", priority = "LOW")
    public void refactorUI() {
        System.out.println("Refactoring UI...");
    }
}

