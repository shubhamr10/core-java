/*
* ==> Compact Notation
* While using the assignment operator (=), we may have to use the same variable
* at both the sides of the operator. In such case, we can eliminate reptition of the
* variable and use compact notation.
* */

class Program18Demo{
    public static void main(String args[]){
        int x = 10;
//        x = x +10;
//        This can be also written as:
        x+=10;
        System.out.println("Compact notation => x+=10 = "+x);

        int amt = 1500 , discount = 100;
//        amt = amt - discount;
//        This can also be written as
        amt -= discount;
        System.out.println("Compact notation => amt-=discount = "+amt);

        int salary = 500;
//        salary = salary * 10.5;
//        This can also be written as.
        salary*=10.5;
        System.out.println("Compact notation => salary*=10.5 = "+salary);

        int p = 10;
//        p = p /2;
//        This can also be written as
        p/=2;
        System.out.println("Compact notation => p/=2 = "+p);

        int numb = 100;
//        numb = numb % 2;
//        This can be also written as
        numb%=2;
        System.out.println("Compact notation => numb%=2 = "+numb);

    }
}
