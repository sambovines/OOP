package OOP.Example5Car;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int size = scan.nextInt();
        Car[] cars = new Car[size];

        // Заполнение массива
        for (int i = 0; i < size; i++) {
            String brand = scan.next();
            String owner = scan.next();
            double volume = scan.nextDouble();
            int year = scan.nextInt();

            cars[i] = new Car(brand, owner, volume, year);
        }
        // Ввод номера автомобиля и нового объема
        int carNumber = scan.nextInt() - 1; // преобразуем в индекс (отсчет с 0)
        double newVolume = scan.nextDouble();
        cars[carNumber].setVolume(newVolume);

        // Вывод массива
        for (Car car : cars) {
            System.out.println(car);
        }

        System.out.println(); // Пустая строка

        // Поиск самого нового автомобиля
        Car newestCar = cars[0];
        for (int i = 1; i < cars.length; i++) {
            if (cars[i].getYearOfMade() > newestCar.getYearOfMade()) {
                newestCar = cars[i];
            }
        }
        System.out.println(newestCar);
    }
}
