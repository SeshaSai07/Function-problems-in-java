// Write a Java method to display the middle character of a string.
import java.util.Scanner;
public class question15 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Input String: ");
        String str = in.nextLine();
        System.out.println("The middle character in the string is " + middleChar(str));
    }
    
    public static String middleChar(String str)
    {
        int position , length;
        if (str.length() % 2 == 0) 
        {
            position = str.length() / 2 - 1;
            length = 2;
        }
        else
        {
            position = str.length() / 2;
            length = 1;
        }
        return str.substring(position, position + length);
    }
}
