/*
* Write a program to display values of I and J using nested loop.
* Demonstrate use of labeled loop and continue.
* */

// import java.lang.*;

class Program13Demo{
    public static void main(String args[]){
        int i = 1, j;

        loop1: while(i<=3){
            System.out.print(i);
            loop2: for(j = 1; j<=5;j++){
                System.out.println("\t"+j);
                if(j==3){
                    i++;
                    continue loop1;
                }
            }
            i++;
            System.out.println("----------------");
        }
    }
}
