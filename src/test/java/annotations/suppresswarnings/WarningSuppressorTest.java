package annotations.suppresswarnings;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.List;

class WarningSuppressorTest {

    @Test
    void testAddElementsSize() {
        WarningSuppressor ws = new WarningSuppressor();
        List list = ws.addElements();
        assertEquals(3, list.size());
    }

    @Test
    void testAddElementsContent() {
        WarningSuppressor ws = new WarningSuppressor();
        List list = ws.addElements();
        assertEquals("Java", list.get(0));
        assertEquals(100, list.get(1));
        assertEquals(true, list.get(2));
    }

    @Test
    void testRawTypeBehavior() {
        WarningSuppressor ws = new WarningSuppressor();
        List list = ws.addElements();
        assertInstanceOf(String.class, list.get(0));
        assertInstanceOf(Integer.class, list.get(1));
        assertInstanceOf(Boolean.class, list.get(2));
    }
}
