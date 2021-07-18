/* 
 Program to accept and display a character from keyboard
 Multi line comments - Shift + Alt + A
*/
import java.io.*;

class Program19Demo {
    public static void main(String args[]) throws IOException 
    {
        // create BufferedReader object to accept data from keyboard
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // ask for char and read it
        System.out.print("Enter a characted: ");
        char ch = (char) br.read();

        // display the character
        System.out.println("You entered: " + ch);
        

    }
}