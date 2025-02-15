package junit.advancepracticeproblems.testdateformatter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateFormatter {

    // Method to convert yyyy-MM-dd to dd-MM-yyyy format
    public static String formatDate(String inputDate) {
        if (inputDate == null || inputDate.isEmpty()) {
            return "Invalid date format";
        }

        try {
            LocalDate date = LocalDate.parse(inputDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            return date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        } catch (DateTimeParseException e) {
            return "Invalid date format";
        }
    }
}
