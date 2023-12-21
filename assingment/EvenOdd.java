package assingment;
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println("The number " + num + " is " + result + ".");
    }
}

