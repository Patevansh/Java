package assingment;
class Parent1 {
    void display() {
        System.out.println("This is the Parent class.");
    }
}

class Child1 extends Parent1 {
    @Override
    void display() {
        super.display(); // Calling the display method of the parent class
        System.out.println("This is the Child class.");
    }
}

public class SuperWithMethods {
    public static void main(String[] args) {
        Child1 child = new Child1();
        child.display();
    }
}

