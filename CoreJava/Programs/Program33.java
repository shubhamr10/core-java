import java.io.*;

public class Program33 {
    public static void main(String args[]) throws IOException
    {
        // Intiate BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // create an int type array
        System.out.print("How many elements?  ");
        int n = Integer.parseInt(br.readLine());

        // create a new array
        int arr[] = new int[n];

        // accept integer elements into the arary
        for(int i = 0 ;i< n; i++){
            System.out.println("Enter an integer:");
            arr[i] = Integer.parseInt(br.readLine());
        }

        // displaying the results
        for(int i = 0; i < n ; i++ ){
            System.out.print(arr[i]+" ");
        }
    }
}
