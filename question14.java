import java.util.Scanner;
public class question14 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side-1 : ");
        double side1 = sc.nextDouble();
        System.out.print("Enter side-2 : ");
        double side2 = sc.nextDouble();
        System.out.print("Enter side-3 : ");
        double side3 = sc.nextDouble();
        System.out.println("Area of triangle: " + areaOfTri(side1 , side2 , side3));
    }

    /*public static double areaOfTri(double side1 , double side2 , double side3)
    {
        double area;
        area = side1 + side2 + side3 / 2;
        return area;
    }
    /* */

    public static boolean is_Valid(double side1 , double side2 , double side3)
    {
        if (side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2) 
            return true;
        else
            return false;
    }

    public static double areaOfTri(double side1 , double side2 , double side3)
    {
        double area = 0;
        double s = (side1 + side2 + side3) / 2;
        area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        return area;
    }
    
}
