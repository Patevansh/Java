package assingment;

class Animal {
        void makeSound() {
        System.out.println("Some sound");
        }
        }

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        Animal animal = new Cat();
            animal.makeSound();
    }
}

