package SetterGetter.Pmis;

public class MyDate {

    private int day;
    private int month;
    int year;

    public MyDate(int day, int month, int year) {

        this.day = day;
        this.month = month;
        this.year = year;
    }
        public void display() {

            System.out.println(this.day + "/" + this.month + "/" + this.year);
        }

        // adding setter getter as we put private for variable.
        // the date could be invalid. so we need to add a if logic.
            public void setDay (int day) {
            if (day>0 && day <=31){
                this.day = day;
            } else {
                System.out.println(day + " is an Invalid day");
        }

    }
            public int getDay(){
                return this.day;
            }

}


