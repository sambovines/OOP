package OOP.Example1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        BankAccount[] basa = new BankAccount[n];

        String name;
        int amount;
        for (int i = 0; i< basa.length-1; i++) {
            name= scan.nextLine();
            amount= scan.nextInt();
            scan.nextLine();
            basa[i] = new BankAccount(name,amount);
        }

        name= scan.nextLine();
        basa[basa.length-1]=new BankAccount(name);

        for (BankAccount item:basa) {
            System.out.println(item);
        }

        int nalog = scan.nextInt();
        scan.nextLine();
        for (BankAccount item:basa) {
            item.decrease(nalog);
        }

        System.out.println("Список должников");
        for (int i=0; i< basa.length; i++) {
            if (basa[i].debt()>0) {
                basa[i].show();
            }
        }

        int max = basa[0].getAmount();
        for (int i=1; i< basa.length; i++) {
            if (basa[i].getAmount()>max) {
                max=basa[i].getAmount();
            }
        }
        System.out.println("Максимальная сумма у предприятий");
        for (int i=0; i< basa.length; i++) {
            if (basa[i].getAmount() == max) {
                System.out.println(basa[i]);
            }
        }
    }
}
