package assingment;
class Student {
    String name;
    int age;

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class ObjectDemo {
    public static void main(String[] args) {
        // Create an object of the Student class
        Student student1 = new Student();

        // Set object properties
        student1.name = "John";
        student1.age = 20;

        // Use the object to display information
        student1.displayInfo();
    }
}

