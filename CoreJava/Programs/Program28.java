import java.io.*;

public class Program28 {
    public static void main(String args[]) throws IOException
    {
        // create BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("How many fibbonacci series ? ");
        int n = Integer.parseInt(br.readLine());

        // take two first two fibbonanci as 0 and 1
        long f1=0, f2 = 1;

        System.out.println(f1);
        System.out.println(f2);

        // Next fibbonaci series
        long f = f1+f2;

        // Already 3 fibbonaci are displayed. So count will start at 3
        int count = 3;
        while(count < n)
        {
            f1 = f2;
            f2 = f;
            f=f1+f2;
            System.out.println(f);
            count++;
        }
    }
}
