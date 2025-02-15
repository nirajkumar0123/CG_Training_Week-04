package junit.advancepracticeproblems.passwordstrengthval;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    @Test
    void testValidPassword() {
        assertTrue(PasswordValidator.isValid("StrongPass1"), "Valid password should return true.");
    }

    @Test
    void testPasswordTooShort() {
        assertFalse(PasswordValidator.isValid("Ab1"), "Password with less than 8 characters should return false.");
    }

    @Test
    void testPasswordWithoutUppercase() {
        assertFalse(PasswordValidator.isValid("weakpassword1"), "Password without uppercase should return false.");
    }

    @Test
    void testPasswordWithoutDigit() {
        assertFalse(PasswordValidator.isValid("NoDigitHere"), "Password without a digit should return false.");
    }

    @Test
    void testNullPassword() {
        assertFalse(PasswordValidator.isValid(null), "Null password should return false.");
    }

    @Test
    void testEmptyPassword() {
        assertFalse(PasswordValidator.isValid(""), "Empty password should return false.");
    }
}
