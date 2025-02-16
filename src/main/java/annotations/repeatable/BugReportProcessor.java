package annotations.repeatable;

import java.lang.reflect.Method;

public class BugReportProcessor {
    public static void main(String[] args) {
        try {
            Method method = BugTracker.class.getMethod("processTask");

            if (method.isAnnotationPresent(BugReports.class)) {
                BugReport[] bugReports = method.getAnnotation(BugReports.class).value();
                for (BugReport bug : bugReports) {
                    System.out.println("Bug Report: " + bug.description());
                }
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}

