// factorial of a number
import java.util.Scanner;
public class question7 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("enter a number: ");
        int num = in.nextInt();
        int res = factorial(num);
        System.out.println("Factorial of the given number is: " + res);

        in.close();
    }

    static int factorial(int num)
    {
        int res = 1 , i;
        for (i = 2; i <= num; i++)
        {
            res *= i;
        }
        return res;
    }
    
}
