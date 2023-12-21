package assingment;
import java.util.ArrayList;

public class ArrayListExample1 {
    public static void main(String[] args) {
        // Creating an ArrayList of Strings
        ArrayList<String> arrayList = new ArrayList<>();

        // Adding elements to the ArrayList
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");

        // Accessing elements using for-each loop
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }
    }
}
