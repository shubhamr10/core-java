import java.io.*;

class Program22Demo {
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Ask for an integer value
        System.out.println("Enter your year of birth and we will tell your age");

        // Accept the year of birth
        int yearofBirth = Integer.parseInt(br.readLine());
        System.out.println(yearofBirth);
        int todayYear = 2021;
        int yourAgr = todayYear - yearofBirth;
        System.out.println("You were born on "+yearofBirth+"You are "+yourAgr+" age");
    }
}