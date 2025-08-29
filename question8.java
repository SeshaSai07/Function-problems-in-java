// check whether the given number is palindrome or not
import java.util.Scanner;
public class question8 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = in.nextInt();
        if (isPalindrome(number) == true) 
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }

    static boolean isPalindrome(int number)
    {
        int reverse = 0;
        // Copy of the original number so that the original
        // number remains unchanged while finding the reverse
        int temp = Math.abs(number);
        while (temp != 0)
        {
            reverse = (reverse * 10) + (temp % 10);
            temp = temp / 10;            
        }
        // If reverse is equal to the original number, the
        // number is palindrome
        return (reverse == Math.abs(number));
    }
    
}
