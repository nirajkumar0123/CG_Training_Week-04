package junit.listoperations;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

class ListManagerTest {
    private ListManager listManager;
    private List<Integer> list;

    @BeforeEach
    void setUp() {
        listManager = new ListManager();
        list = new ArrayList<>();
    }

    @Test
    void testAddElement() {
        listManager.addElement(list, 5);
        assertTrue(list.contains(5));
        assertEquals(1, list.size());

        listManager.addElement(list, 10);
        assertTrue(list.contains(10));
        assertEquals(2, list.size());
    }

    @Test
    void testRemoveElement() {
        listManager.addElement(list, 5);
        listManager.addElement(list, 10);
        listManager.removeElement(list, 5);

        assertFalse(list.contains(5));
        assertEquals(1, list.size());

        listManager.removeElement(list, 10);
        assertFalse(list.contains(10));
        assertEquals(0, list.size());
    }

    @Test
    void testGetSize() {
        assertEquals(0, listManager.getSize(list));

        listManager.addElement(list, 5);
        assertEquals(1, listManager.getSize(list));

        listManager.addElement(list, 10);
        assertEquals(2, listManager.getSize(list));

        listManager.removeElement(list, 5);
        assertEquals(1, listManager.getSize(list));

        listManager.removeElement(list, 10);
        assertEquals(0, listManager.getSize(list));
    }

    @Test
    void testNullListOperations() {
        assertDoesNotThrow(() -> listManager.addElement(null, 5));
        assertDoesNotThrow(() -> listManager.removeElement(null, 5));
        assertEquals(0, listManager.getSize(null));
    }
}
