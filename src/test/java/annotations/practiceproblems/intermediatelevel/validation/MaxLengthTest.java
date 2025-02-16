package annotations.practiceproblems.intermediatelevel.validation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MaxLengthTest {

    @Test
    void testValidUsername() {
        User user = new User("JohnDoe");
        assertEquals("JohnDoe", user.getUsername());
    }

    @Test
    void testExceedingMaxLength() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> new User("LongUsername123"));
        assertTrue(exception.getMessage().contains("exceeds max length"));
    }

    @Test
    void testExactMaxLength() {
        User user = new User("MaxLength1");
        assertEquals("MaxLength1", user.getUsername());
    }
}
