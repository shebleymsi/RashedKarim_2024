package SetterGetter.Root;


import SetterGetter.Pmis.MyDate;
import SetterGetter.Pmis.Person;

import static java.lang.Math.PI;

public class Application {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Person saiful;

        String name = "Rashed";

        // 01/11/2023

        MyDate date = new  MyDate(1,11,2023);
        date.display();


        //change the day here by using setter method at person.
         date.setDay(2);
         date.display();



        //change the day to an invalid day

        date.setDay(40);
        date.display();

        // just ot show contrast between constant and variable
        System.out.println(Math.abs(-4));
        System.out.println(PI);


        // use getter method
        System.out.println(date.getDay());

        // add a number to the day
        System.out.println(date.getDay()+1);



    }
}
