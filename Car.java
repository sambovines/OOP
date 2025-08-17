package OOP.Example5Car;
import java.util.Calendar;
import java.util.Scanner;

public class Car {
    private String brand;
    private String owner;
    private double volume;
    private int yearOfMade;
    private static int yearNow;

    static {
        Calendar cal = Calendar.getInstance();
        yearNow = cal.get(Calendar.YEAR);
    }

    public Car() {
    }

    public Car(String brand, String owner, double volume, int yearOfMade) {
        this.brand = brand;
        this.owner = owner;
        this.volume = volume;
        this.yearOfMade = yearOfMade;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public int getYearOfMade() {
        return yearOfMade;
    }

    public void setYearOfMade(int yearOfMade) {
        this.yearOfMade = yearOfMade;
    }

    public static int getYearNow() {
        return yearNow;
    }


    public int getLife() {
        return yearNow-yearOfMade;
    }

    @Override
    public String toString() {
        return String.format("Car{brand='%s', owner='%s', volume=%.1f, yearOfMade=%d}",
                brand, owner, volume, yearOfMade);
    }
}
