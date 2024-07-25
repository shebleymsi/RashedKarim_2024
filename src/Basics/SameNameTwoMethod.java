package Basics;


// here two method looks similar. here is the tricks.
// one method is main. another one is normal method. though their name is same but one their arguments are different.
//and main method has superiority here.
public class SameNameTwoMethod {
    public static void main(String[] args) {
        main("Hello ");
    }

    public static void main(String args) {
        System.out.print(args+ "world");
    }
}
