// check whether the give number is prime or not
import java.util.Scanner;
public class question1 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean ans = isPrime(n);
        System.out.println(ans);
    }

    static boolean isPrime(int n)
    {
        if (n <= 1) 
        {
            return false;
        }

        int c = 2;
        while (c * c <= n)
        {
            if (c % 2 == 0) 
            {
                return false;
            }
            c++;
        }
        /* if (c * c > n) 
        {
            return true;
        }
        return false;*/

        return c * c > n;
    }
    
}
