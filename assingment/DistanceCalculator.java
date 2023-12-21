package assingment;
import java.util.Scanner;

public class DistanceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter latitude and longitude of City 1 ");
        double lat1 = scanner.nextDouble();
        double lon1 = scanner.nextDouble();

        System.out.print("Enter latitude and longitude of City 2");
        double lat2 = scanner.nextDouble();
        double lon2 = scanner.nextDouble();

        double distance = calculateDistance(lat1, lon1, lat2, lon2);
        System.out.println("The distance between the two cities is approximately " + distance + " kilometers.");
    }

    public static double calculateDistance(double lat1, double lon1, double lat2, double lon2) {
        final int R = 6371; // Radius of the Earth in kilometers
        double lat1Radians = Math.toRadians(lat1);
        double lat2Radians = Math.toRadians(lat2);
        double latDiff = Math.toRadians(lat2 - lat1);
        double lonDiff = Math.toRadians(lon2 - lon1);

        double a = Math.sin(latDiff/2) * Math.sin(latDiff/2) +
                Math.cos(lat1Radians) * Math.cos(lat2Radians) *
                        Math.sin(lonDiff/2) * Math.sin(lonDiff/2);

        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        return R * c;
    }
}

