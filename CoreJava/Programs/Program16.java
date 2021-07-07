/*
* Arthemtic Operator ==>
* */
import java.lang.*;

class Program16Demo{
    public static void main(String args[]){
//        Arthmetice Operator
//        + ==> Addition Operator
        int a = 10, b = 24;
        int add;

        add = a+b;
        System.out.println("Sum of 2 numbers a & b = "+add);

//        - ==> Substraction Operator
        int subtract = add - a;
        System.out.println("Subtracting c from a will leave ==> "+subtract);

//        * ==> Multiplication Operator
        int mul = add*a;
        System.out.println("Multiplying c * a ==> "+mul);

//        / ==> Division Operator
        int division = add/a;
        System.out.println("Quotient of division c/a will be"+ division);

//        % ==> Modulus Operator
        int mod = add%a;
        System.out.println("Modulus of c%a ==> "+mod);
    }
}
