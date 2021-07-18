/* Write a program to demonstrate all the backlash code */
/*
* |  Backslash Code  |  Meaning     |
* 1. \n ==> New Line
* 2. \t ==> Horizontal tab space
* 3. \r ==> Enter Key
* 4. \b ==> Backspace
* 5. \f ==> Form feed
* 6. \\ ==> Displays \ (Single \);
* 7. \" ==> Displays "
* 8. \' ==> Displays '
* */


class Program2Formatting{
    public static void main( String args[] ){
        int a = 1, b = 2, c = 3, d = 4;
        System.out.print(a+"\t"+b);
        System.out.println(b+"\n"+b);
        System.out.print(":"+c);
        System.out.println();
        System.out.println("Hello\\HI\""+d);
    }
}
