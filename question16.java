// Calculate the pentagon area

import java.util.Scanner;
public class question16 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of sides : ");
        double nos = sc.nextDouble();
        System.out.print("Enter the side : ");
        double side = sc.nextDouble();
        System.out.println("The area of pentagon: " + areaOfPentagon(nos , side));
    }
    
    public static double areaOfPentagon(double nos , double side)
    {   
        double area = (Math.sqrt(5 * (5 + 2 * Math.sqrt(5)))/ 4) * side  * side;
        return area;
    }
}
