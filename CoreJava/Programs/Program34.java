import java.io.*;

/* 
Program to accept the marks and calculate the total marks and the percentages.
*/

public class Program34 {
    public static void main(String args[])throws IOException
    {
        // Initialise BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Ask how many subjects.
        System.out.print("How many subjects? ==>");
        int n = Integer.parseInt(br.readLine());

        // create a array with size n
        int[] marks = new int[n];
        
        // Store marks into the array
        for(int i = 0; i < n; i++){
            System.out.print("Enter the marks => ");
            marks[i] = Integer.parseInt(br.readLine());

        }
        int total = 0;
        // Calculate total
        for(int i =0; i< n; i++){
            total = total + marks[i];
        }
        // Calculate percentage.
        System.out.println((float) total/(n*100)*100);
        float per =(float) ((float)  total/(n*100))*100;

        // Display the results
        System.out.println("Total marks obtained"+total);
        System.out.println("Percentage obtained"+per);
    }
}
