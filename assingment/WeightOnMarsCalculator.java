package assingment;
import java.util.Scanner;

public class WeightOnMarsCalculator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your weight on Earth : ");
            double weightOnEarth = scanner.nextDouble();

            double weightOnMars = weightOnEarth * 0.38;
            System.out.println("Your weight on Mars is" + weightOnMars);
        }
    }
}

