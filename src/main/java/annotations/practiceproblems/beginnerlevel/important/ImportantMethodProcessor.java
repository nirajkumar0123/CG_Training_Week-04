package annotations.practiceproblems.beginnerlevel.important;

import java.lang.reflect.Method;

public class ImportantMethodProcessor {
    public static void main(String[] args) {
        Method[] methods = CriticalOperations.class.getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(ImportantMethod.class)) {
                ImportantMethod annotation = method.getAnnotation(ImportantMethod.class);
                System.out.println("Important Method: " + method.getName() + " (Level: " + annotation.level() + ")");
            }
        }
    }
}
