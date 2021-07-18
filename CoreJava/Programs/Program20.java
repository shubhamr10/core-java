import java.io.*;

class Program20Demo {
    public static void main(String args[]) throws IOException 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Ask for a float value
        System.out.println("Enter a float value here : ");

        // Accept the float value
        float flvalue = Float.parseFloat(br.readLine());

        // Display the float value
        System.out.println("You have entered : "+flvalue);
    }   
}
