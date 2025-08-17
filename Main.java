package OOP.Example4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        if (size<0) {
            System.out.println("ERROR");
            return;
        }
        scan.nextLine();

        Purchase[] purchases = new Purchase[size];
        for (int i = 0; i<size; i++) {
            String name= scan.next();
            int price = scan.nextInt();
            int quantity = scan.nextInt();
            scan.nextLine();

            Commodity commodity = new Commodity(name, price);
            purchases[i] = new Purchase(commodity, quantity);
        }

        int maxCost = 0;
        for (Purchase purchase : purchases) {
            if (purchase.getCost() > maxCost) {
                maxCost = purchase.getCost();
            }
        }
        for (Purchase purchase : purchases) {
            if (purchase.getCost() == maxCost) {
                System.out.println(purchase);
            }
        }
    }
}
