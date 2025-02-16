package annotations.animals;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class AnimalTest {
    @Test
    void testAnimalSound() {
        Animal animal = new Animal();
        assertEquals("Some generic sound", animal.makeSound());
    }

    @Test
    void testDogSound() {
        Dog dog = new Dog();
        assertEquals("Bark", dog.makeSound());
    }

    @Test
    void testDogIsAnimal() {
        Animal dog = new Dog();
        assertEquals("Bark", dog.makeSound());
    }
}
