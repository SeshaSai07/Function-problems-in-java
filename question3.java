// check whether the give number is even or odd
import java.util.Scanner;
public class question3 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean ans = isEvenOrOdd(n);
        System.out.println(ans);
    }

    static boolean isEvenOrOdd(int n)
    {
        if (n % 2 == 0) 
        {
            return true;   
        }
        else
        {
            return false;
        }
    }
    
}
