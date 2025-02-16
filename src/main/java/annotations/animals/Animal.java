package annotations.animals;

class Animal {
    String makeSound() {
        return "Some generic sound";
    }
}

class Dog extends Animal {
    @Override
    String makeSound() {
        return "Bark";
    }
}

