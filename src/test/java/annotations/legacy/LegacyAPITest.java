package annotations.legacy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LegacyAPITest {

    @Test
    void testNewFeature() {
        LegacyAPI api = new LegacyAPI();
        assertEquals("This is the new feature, use this instead.", api.newFeature());
    }

    @Test
    @Deprecated
    void testOldFeature() {
        LegacyAPI api = new LegacyAPI();
        api.oldFeature(); // This should print a warning but still execute.
    }

    @Test
    void testBothFeatures() {
        LegacyAPI api = new LegacyAPI();
        api.oldFeature();
        assertEquals("This is the new feature, use this instead.", api.newFeature());
    }
}
