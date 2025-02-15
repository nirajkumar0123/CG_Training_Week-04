package junit.advancepracticeproblems.testdateformatter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DateFormatterTest {

    @Test
    void testValidDateFormat() {
        assertEquals("25-12-2024", DateFormatter.formatDate("2024-12-25"), "Format should be dd-MM-yyyy");
        assertEquals("01-01-2023", DateFormatter.formatDate("2023-01-01"), "Format should be dd-MM-yyyy");
    }

    @Test
    void testInvalidDateFormat() {
        assertEquals("Invalid date format", DateFormatter.formatDate("12-25-2024"), "Should return error message");
        assertEquals("Invalid date format", DateFormatter.formatDate("2024/12/25"), "Should return error message");
        assertEquals("Invalid date format", DateFormatter.formatDate("abcd-ef-gh"), "Should return error message");
    }

    @Test
    void testEmptyOrNullInput() {
        assertEquals("Invalid date format", DateFormatter.formatDate(""), "Empty input should return error");
        assertEquals("Invalid date format", DateFormatter.formatDate(null), "Null input should return error");
    }
}
