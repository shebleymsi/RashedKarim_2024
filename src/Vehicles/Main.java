package Inheritance.Vehicles;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car(200, 30, 3000);
        System.out.println("Car HP: " + myCar.hp);
        System.out.println("Car Mileage: " + myCar.mileage);
    }
}