package OOP;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BusinessTrip trip = new BusinessTrip();

        trip.name = scanner.nextLine();

        trip.days = scanner.nextInt();

        trip.many = scanner.nextInt();

        trip.show();

    }
}
