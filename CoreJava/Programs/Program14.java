/*
* Write a program to return a value from the method
* */

class Program14Demo{
    public static void main(String args[]){
//        call myMethod() and catch the result into res,
//        since myMethod() is static, we can call it using classname.methodname()
        int res = Program14Demo.myMethod(10);
//        display the result now
        System.out.println("Results= "+res);
    }
//    this method calculates square value and returns it to main()
    static int myMethod(int num){
        return num * num; // return square value
    }
}
