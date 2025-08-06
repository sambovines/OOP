package OOP;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee emp = new Employee();

        emp.surname = scanner.next();
        emp.gender = scanner.next();
        emp.age = scanner.nextInt();
        emp.salary = scanner.nextInt();

        if (emp.isPensioner()) {
            emp.changeSalary(0.9);
        }
        emp.show();
    }
}
