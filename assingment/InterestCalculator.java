package assingment;
import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter initial investment amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter annual interest rate (as a decimal): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();

        double amount = principal * Math.pow(1 + rate, years);
        double interestEarned = amount - principal;

        System.out.println("Total amount of interest earned: " + interestEarned);
    }
}

