import java.io.*;
import java.util.*;

public class Program25 {
    public static void main(String args[]) throws IOException
    {
        // To accept data from keyboard
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Ask for input separated by commas
        System.out.println("Enter name, age, salary :");

        // Accept input into a string
        String str = br.readLine();

        // use StringTokeniser to split input at commas
        StringTokenizer st = new StringTokenizer(str, ",");

        // We will have 3 tokens as strings
        // first token represents name, second one age, third one salary
        String s1 = st.nextToken();
        String s2 = st.nextToken();
        String s3 = st.nextToken();

        // trim any spaces before and after the tokens
        s1 = s1.trim();
        s2 = s2.trim();
        s3 = s3.trim();

        // convert s1 into string, s2 into an int and s3 into a float
        String name = s1;
        int age = Integer.parseInt(s2);
        float sal = Float.parseFloat(s3);

        // display the entered data
        System.out.println("Name= "+ name);
        System.out.println("Age= "+age);
        System.out.println("Salary= "+sal);
    }
}
