import java.io.*;

public class Program23 {
    public static void main(String args[])throws IOException
    {
        // create a Buffered
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Prompt for value
        System.out.println("Please enter a float value :");

        // Accepting a double value
        double dln = Double.parseDouble(br.readLine());

        // Display the float
        System.out.println("You entered :" + dln);
    }
}
