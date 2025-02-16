package annotations.repeatable;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

class BugReportTest {

    @Test
    void testBugReportsAnnotationExists() throws NoSuchMethodException {
        Method method = BugTracker.class.getMethod("processTask");
        assertTrue(method.isAnnotationPresent(BugReports.class));
    }

    @Test
    void testBugReportDescriptions() throws NoSuchMethodException {
        Method method = BugTracker.class.getMethod("processTask");
        BugReport[] bugReports = method.getAnnotation(BugReports.class).value();
        assertEquals("Null pointer exception when input is null", bugReports[0].description());
        assertEquals("Performance issue on large data sets", bugReports[1].description());
    }

    @Test
    void testBugReportsCount() throws NoSuchMethodException {
        Method method = BugTracker.class.getMethod("processTask");
        BugReport[] bugReports = method.getAnnotation(BugReports.class).value();
        assertEquals(2, bugReports.length);
    }
}
