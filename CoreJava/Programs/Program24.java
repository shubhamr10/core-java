import java.io.*;

public class Program24 {
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Accept the employee details
        System.out.println("Enter a roll number : ");
        int id = Integer.parseInt(br.readLine());

        // Please enter gender
        System.out.println("Enter your gender:(M/F) :");
        char gender = (char) br.read();
        br.skip(2);
        // Solution - 1
        // char gender = (char) br.readLine().charAt(0);
        

        // Enter the name
        System.out.println("Enter a name :");
        String name = br.readLine();

        // Display the employee details
        System.out.println("Roll number :"+id);
        System.out.println("Gender :"+gender);
        System.out.println("Name :"+name);
    }
}
