package OOP;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Commodity com = new Commodity();
        Scanner scan = new Scanner(System.in);

        com.name = scan.nextLine();
        com.price = scan.nextInt();
        scan.nextLine();

        Purchase pur = new Purchase();
        pur.commodity = com;
        pur.kol = scan.nextInt();
        scan.nextLine();

        pur.show();

        int price2 = scan.nextInt();
        com.price = price2;

        System.out.println();

        pur.show();

    }
}
