/*
* ==> Continue Statement
* => Write a program using for loop to display
* => the numbers in descending order.
* */

// import java.lang.*;

class Program12Demo{
    public static void main(String args[]){
//        for(int i = 10; i >= 1; i--){
//            System.out.print(i+" ");
//        }

//        Now writing the above statement using contine if i>5

        for( int i = 10; i >= 1 ; i--){
            if(i>5)
                continue;

            System.out.print(i+" ");
        }
        System.out.println();
    }
}
