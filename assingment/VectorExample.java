package assingment;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        // Creating a Vector of Strings
        Vector<String> vector = new Vector<>();

        // Adding elements to the Vector
        vector.add("Red");
        vector.add("Green");
        vector.add("Blue");

        // Accessing elements using for-each loop
        for (String color : vector) {
            System.out.println(color);
        }
    }
}
