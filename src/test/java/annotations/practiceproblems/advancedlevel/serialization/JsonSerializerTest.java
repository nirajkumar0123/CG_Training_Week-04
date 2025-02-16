package annotations.practiceproblems.advancedlevel.serialization;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class JsonSerializerTest {

    @Test
    void testJsonSerialization() {
        User user = new User("Alice", 30);
        String json = JsonSerializer.serialize(user);
        assertTrue(json.contains("\"user_name\":\"Alice\""));
        assertTrue(json.contains("\"user_age\":30"));
    }

    @Test
    void testEmptyJsonForNoAnnotations() {
        class TestClass {
            private String field = "test";
        }
        TestClass obj = new TestClass();
        String json = JsonSerializer.serialize(obj);
        assertEquals("{}", json);
    }

    @Test
    void testSerializationWithDifferentValues() {
        User user = new User("Bob", 40);
        String json = JsonSerializer.serialize(user);
        assertTrue(json.contains("\"user_name\":\"Bob\""));
        assertTrue(json.contains("\"user_age\":40"));
    }
}
