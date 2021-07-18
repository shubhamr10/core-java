import java.io.*;

class Program21Demo {
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Accept String from Keyboard
        System.out.print("Enter a name: ");
        String name = br.readLine();

        // display the string
        System.out.println("You entered: "+name);
    }
}
