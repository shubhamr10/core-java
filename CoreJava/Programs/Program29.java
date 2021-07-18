import java.io.*;
import java.util.*;

public class Program29 {
    public static void main(String args[]) throws IOException
    {
        System.out.println("Enter id, name and salary :");
        Scanner sc = new Scanner(System.in);

        int id = sc.nextInt();
        String name = sc.next();
        float sal = sc.nextFloat();

        System.out.println("ID="+ id);
        System.out.println("Name= "+name);
        System.out.println("Sal ="+sal);
    }
}
