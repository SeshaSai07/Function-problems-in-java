// write a java method to find the smallest number among three
import java.util.Scanner;
public class question12 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        double x = sc.nextDouble();
        System.out.print("Enter the second number: ");
        double y = sc.nextDouble();
        System.out.print("Enter the third number: ");
        double z = sc.nextDouble();
        sc.close();
        System.out.println("The smallest number is: " + smallOfThreeNum(x , y , z));
    }
    static double smallOfThreeNum(double x , double  y ,double z)
    {
        return Math.min(Math.min(x, y) , z);
    }
}
