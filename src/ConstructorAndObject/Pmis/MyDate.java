package ConstructorAndObject.Pmis;

public class MyDate {

    public int day;
    public int month;
    public int year;

    public MyDate(int day, int month, int year) {

        this.day = day;
        this.month = month;
        this.year = year;
    }
        public void display() {

            System.out.println(this.day + "/" + this.month + "/" + this.year);
        }
    }


