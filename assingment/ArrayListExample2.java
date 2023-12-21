package assingment;
import java.util.ArrayList;

public class ArrayListExample2 {
    public static void main(String[] args) {
        // Creating an ArrayList of Integers
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Adding elements to the ArrayList
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);

        // Accessing elements using for loop
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}

