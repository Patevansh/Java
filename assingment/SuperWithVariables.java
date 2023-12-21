package assingment;
class Parent {
    int x = 10;
}

class Child extends Parent {
    int x = 20;

    void display() {
        System.out.println("Child class variable x: " + x);
        System.out.println("Parent class variable x: " + super.x);
    }
}

public class SuperWithVariables {
    public static void main(String[] args) {
        Child child = new Child();
        child.display();
    }
}

