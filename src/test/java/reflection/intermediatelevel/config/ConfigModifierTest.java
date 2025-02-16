package reflection.intermediatelevel.config;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.*;

public class ConfigModifierTest {

    @Test
    public void testModifyApiKey() throws Exception {
        Field field = Configuration.class.getDeclaredField("API_KEY");
        field.setAccessible(true);
        field.set(null, "TEST_KEY");

        assertEquals("TEST_KEY", Configuration.getApiKey());
    }

    @Test
    public void testDefaultApiKey() {
        assertEquals("DEFAULT_KEY", Configuration.getApiKey());
    }

    @Test
    public void testApiKeyNotNull() {
        assertNotNull(Configuration.getApiKey());
    }
}
