/*
* ==> Naming Convention and Data Types
* */
import java.lang.*;

class Program15Demo{
    public static void main(String args[]){
//        Integer Data Types
//        Byte => 1 byte => -128 to +127
//        Short => 2 bytes => -32768 to +32767
//        Int => 4 bytes => -2147483648 to +2147483647
//        Long => 8 bytes => -9223372036854775808 to +9223372036854775807
//        Let's understand with an example
        byte values = 127;
        System.out.println("Byte value==>"+values);

        short short_values = 1221;
        System.out.println("Short values==>"+short_values);

        int int_values = 122322;
        System.out.println("Int values==>"+int_values);

        int long_values = 13213213;
        System.out.println("Long values"+long_values);

//        Float Data types
//        Float ==> 4 bytes ==> -3.4 e38 to 1.4e-45 for negative && 1.4e-45 to 3.4e-45 for positive value.
//        Double ==> 8 bytes ==> -1.8e308 to -4.9e-324 for negative && 4.9e-324 to 1.8e308 for positive values
//        You need to add f after float declaration or it will change to double
        float pi = 3.14f;
        System.out.println("Float value==>"+pi);

        double exp = 10e10;
        System.out.println("Double values==>"+exp);

//        Character data type
//        char ==> 2 bytes => 0 to 65535
//        '' ==> We use single quotes to store char literals.
//        "" ==> for String
//        Char can only hold ASCII character as char are changed to ASCII
        char a = 'a';
        char name = 'S';
        System.out.println("Char of a==>"+a);
        System.out.println("Char of name==>"+name);

//        System Data types
//        We use "" double quotes fr String in Java;
        String fullname = "Kumar Shubham Pratik Rauniyar";
        System.out.println("String fullname ==>"+fullname);

//        Boolean Data type
//        It can hold either true or false
        boolean areYouABoy = true;
        System.out.println("Am i a boy ==> "+areYouABoy);
        System.out.println("Am i a girl ==> "+!areYouABoy);

//        Literals
//        A literal represnts a value that is stored directly
//        into a variable in the program
//        boolean result = false;
//        char gender = 'M';
//        short s = 1000;
//        int i = -1256
//        Types of Literals
//        1.Integer  2.Float 3. Character 4.String  5. Boolean

    }
}
