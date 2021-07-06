/*
* Infinite for loop
* Display numbers between 1 to 10 using infinite loop
*  */

import java.lang.*;

class Program7Demo{
    public static void main(String args[]){
        int x = 1;
        for( ; ; ){
            System.out.println(x);
            x++;
            if(x > 10) break;
        }
    }
}
