package Inheritance.Vehicles;


//"Create a class named ‘vehicle’ with two data members ‘hp’ and ‘mileage’. Its constructor has parameters
// for hp and mileage to initialize hp and mileage of the vehicle. Create another class ‘car’ that inherits
// ‘vehicle’ with its constructor having a parameter for its rpm. Calling the constructor of its parent class
//as 'super(hp, mileage)'. Complete these classes and print the hp and mileage of the car."

// This problem teach the use of inheritance and us of Super keyword.

public class Vehicle {

    int hp;
    int mileage;

    public Vehicle(int hp, int mileage) {
        this.hp = hp;
        this.mileage = mileage;

    }
}
