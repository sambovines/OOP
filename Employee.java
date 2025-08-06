package OOP;

public class Employee {
    String surname;
    String gender;
    int age;
    int salary;

    boolean isPensioner() {
        return ("female".equals(gender) && age >= 58) || ("male".equals(gender) && age >= 63);

    }

    void changeSalary(double k) {
        salary = (int) Math.round(salary * k);
    }

    void show() {
        System.out.println(surname + ";" + gender + ";" + age + ";" + salary);
    }
}
