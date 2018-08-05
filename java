import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class CrazX {
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    public static void main(String args[] ) throws Exception {

         
 
    }
   
    static String Rs() throws IOException
    {
        return   br.readLine().trim();
    }
    static String[] Rsa() throws IOException
    {
        return Rs().split(" ");
    }
    static int Ri() throws IOException
    {
        return ConvertToInt(Rs());
    }
    static long Rl() throws IOException
    {
        return ConvertToLong(Rs());
    }
    public static int[] Ria(int n) throws IOException
    {
        int[] num = new int[n];
        String[] s = Rsa();
        for (int i = 0; i < n; i++)
        {
            num[i] = ConvertToInt(s[i]);
        }
        return num;
    }
    public static int[] Ria() throws IOException
    {

        String[] s = Rsa();
        int n = s.length;
        int[] num = new int[n];
        for (int i = 0; i < n; i++)
        {
            num[i] = ConvertToInt(s[i]);
        }
        return num;
    }
    public static int ConvertToInt(String s)
    {
        int y = 0;
        for(char c : s.toCharArray())
        {
            y = y * 10 + (c - '0');
        }
        return y;
    }
    public static long ConvertToLong(String s)
    {
        long y = 0;
        for(char c : s.toCharArray())
        {
            y = y * 10 + (c - '0');
        }
        return y;
    }
   
}
