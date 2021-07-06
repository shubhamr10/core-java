/*
* --> Nested for loops
* Write a program to display traingular stars
* */
import java.lang.*;

class Program8Demo{
    public static void main(String args[]){
        for(int x = 0; x < 5; x++){
            for(int i = 0;i<=x;i++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
