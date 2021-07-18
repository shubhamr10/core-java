import java.io.*;

class Program31{
    public static void main(String args[]) throws IOException
    {
        int i = 65;
        String s = "Hai";
        char ch = 'A';

        // format the output and get into str
        String str = String.format("i=%d%ns=%s%nnch=%c", i, s, ch);
        System.out.println(str);
    }
}