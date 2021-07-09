/*
* ==> Unary Operators
* Unary operator acts on only one operands
* */
import java.lang.*;

class Program17Demo{
    public static void main(String args[]){
//        Unary Operators
//        Unary Minus Operator (-)
//        This operator is used to negate a given value. Negation
//        means converting a positive value into negative value and vice-versa
        int x = 10, y = -20;
        int neg_x = -x;
        int neg_y = -y;
        System.out.println("Negation of values of x : "+neg_x);
        System.out.println("Negation of values of y :"+neg_y);

        /*
        * Increment Operator: This operator increases the value of variable by 1
        * */
        int z = 45;
        int inc_z = z++;
        System.out.println("Increment on value of z will be :"+inc_z);

        /*
        * Pre and Post Increment
        * Pre ==> Do Increment & then do operation first
        * Post ==> Do operation and then increment.
        * */
        int num_a = 50, num_b = 56;
        System.out.println("Pre increment : "+(++num_a));
        System.out.println("Post increment : "+(num_b++));

        /*
        * Decrement Operator
        * ==> This operator is used to decrement the value of a variable by 1.
        * Pre ==> Same as above.
        * Post ==> Same as above.
        * */
        int num_c = 43, num_d = 44;
        System.out.println("Pre decrement : "+(--num_c));
        System.out.println("Post decrement : "+(num_d--));

        /*
        * Assignment Operator
        * ==> This operator is used to store some value into a variable. It is used in 3 ways.
        * * It is used to store a value into a variable. e.g. int x = 5.
        * * It is used to store a value of a variable into another variable. e.g. int x = y.
        * * It is used to store a the value of an expression into a variable.e.g. int x = y+z-4
        * */
    }
}
