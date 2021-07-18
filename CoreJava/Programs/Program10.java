/*
* ==> SWITCH STATEMENT
* Write a program to display the use of Switch statement
* */

// import java.lang.*;

class Program10Demo{
    public static void main(String args[]){
        String color = "green";

        switch (color){
            case "r":
                System.out.println("Red");
                break;
            case "g":
                System.out.println("Green");
                break;
            case "b":
                System.out.println("Blue");
                break;
            case "w":
                System.out.println("White");
                break;
            default:
                System.out.println("Unknown color");
        }
    }
}
