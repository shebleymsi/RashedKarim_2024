package ConstructorAndObject.Root;

import ConstructorAndObject.Pmis.MyDate;
import ConstructorAndObject.Pmis.Person;

public class Application {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Person saiful;

        String name = "Rashed";

        // 01/11/2023

        MyDate date = new  MyDate(1,11,2023);
        date.display();


        //practice: change the day here by using date.
        date.day = 2;
        date.display();
    }
}
