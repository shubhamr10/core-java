/* Write a Java Program to find the Sum of of numbers */

import java.lang.*;

class Program1Sum{
    public static void main( String args[]){
//        Variable declaration
        int x, y;
//        Store declared values
        x = 10;
        y = 25;
//        Calculate the sum and store it in the variable
        int z = x+y; // This is also called dynamci declaration
//        Unformatted Results
        System.out.print(z);
//        Formatted well
        System.out.println();
        System.out.println("Sum of numbers is:"+z);
//        Trying to calculate and print on the same line
        System.out.println("Sum of number is calculated as"+x+y);
//        You will see the output as 1025 . It is because of the type casting precedence.
//        which is done from the left hand side. It means:
//        "Sum of number is calculated as" - It is the left most value of type string.
//        So, type string is set as precedene. In order to solve it properly we
//        will have to use the ()
        System.out.println("Sum of number is calculated as"+(x+y));
    }
}
