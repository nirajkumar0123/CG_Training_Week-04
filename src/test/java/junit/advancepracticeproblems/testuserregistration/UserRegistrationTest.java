package junit.advancepracticeproblems.testuserregistration;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserRegistrationTest {

    private final UserRegistration userRegistration = new UserRegistration();

    @Test
    void testValidUserRegistration() {
        assertDoesNotThrow(() -> userRegistration.registerUser("JohnDoe", "john.doe@example.com", "SecureP@ss123"));
    }

    @Test
    void testEmptyUsernameThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> userRegistration.registerUser("", "valid.email@example.com", "ValidPass123"));
        assertEquals("Username cannot be empty", exception.getMessage());
    }

    @Test
    void testInvalidEmailThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> userRegistration.registerUser("JohnDoe", "invalid-email", "ValidPass123"));
        assertEquals("Invalid email format", exception.getMessage());
    }

    @Test
    void testShortPasswordThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> userRegistration.registerUser("JohnDoe", "john.doe@example.com", "12345"));
        assertEquals("Password must be at least 8 characters long", exception.getMessage());
    }
}
