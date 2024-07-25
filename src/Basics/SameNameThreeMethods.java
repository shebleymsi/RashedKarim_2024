package Basics;




// here three method looks similar. here is the tricks.
// one method is main. another two is normal method. though their name is same but one their arguments are different.
//and in java main method has superiority over other method.
// what's new here: one method has been called in other method. then that method called in main method.
// two layered calling
public class SameNameThreeMethods {

        public static void main(String[] args) {
            main("Hello ");
        }

            public static void main (String args){
                System.out.print(main() + args + "world");
            }

            private static String main () {
                return "Greetings!";
            }
        }
