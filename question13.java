// average of three numbers
import java.util.Scanner;
public class question13 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = in.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = in.nextDouble();
        System.out.print("Enter third number: ");
        double num3 = in.nextDouble();
        System.out.println("Average of three numbers :" + avgThreeNum(num1 , num2, num3));
        
    }

    public static double avgThreeNum(double num1, double num2, double num3)
    {
        double result;
        result = (num1 + num2 + num3) / 2;
        return result;
    }
    
}
