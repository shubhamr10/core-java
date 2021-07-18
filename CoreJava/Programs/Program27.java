import java.io.*;

public class Program27 {
    public static void main(String args[]) throws IOException
    {
        // Create bufferedReader 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Take input of year
        System.out.println("Enter year number :");
        int year = Integer.parseInt(br.readLine());

        if(year % 4 == 0){
            System.out.println("It is a leap year");
        } else {
            System.out.println("It is not a leap year");
        }
    }
}
