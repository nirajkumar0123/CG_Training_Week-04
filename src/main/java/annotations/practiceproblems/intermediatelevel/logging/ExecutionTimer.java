package annotations.practiceproblems.intermediatelevel.logging;

import java.lang.reflect.Method;

public class ExecutionTimer {
    public static void measureExecutionTime(Object obj, String methodName) {
        try {
            Method method = obj.getClass().getMethod(methodName);
            if (method.isAnnotationPresent(LogExecutionTime.class)) {
                long start = System.nanoTime();
                method.invoke(obj);
                long end = System.nanoTime();
                System.out.println(methodName + " executed in " + (end - start) / 1_000_000.0 + " ms");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

