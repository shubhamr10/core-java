import java.io.*;
import java.util.*;

public class Program26 {
    public static void main(String args[]) throws IOException
    {
        // to accept data from keyboard
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // take input into str from keyboard
        System.out.println("Enter two numbers: ");
        String str = br.readLine();

        // split the string at comma
        StringTokenizer st = new StringTokenizer(str, ",");

        // break the st into two number inputs
        String s1 = st.nextToken();
        String s2 = st.nextToken();

        // trim the spaces into s1, s2
        s1 = s1.trim();
        s2 = s2.trim();

        // convert s1 and s2 into double type and store it in n1 and n2
        double n1 = Double.parseDouble(s1);
        double n2 = Double.parseDouble(s2);

        // perform the arthmetic operations
        System.out.println("Result of addition between n1 and n2 :"+(n1+n2));
        System.out.println("Result of substranction between n1 and n2 :"+(n1-n2));
        System.out.println("Result of mulitplication :"+(n1*n2));
        System.out.println("Result of division :"+(n1/n2));
    }   
}
