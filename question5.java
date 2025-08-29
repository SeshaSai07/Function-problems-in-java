// sum of two numbers

import java.util.Scanner;
public class question5 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = in.nextInt();
        System.out.print("Enter second number: ");
        int num2 = in.nextInt();
        in.close();

        int result = sumNum(num1 , num2);
        System.out.println("Result is: " + result);
    }

    static int sumNum(int num1, int num2)
    {
        int sum = num1 + num2;
        return sum;
    }
    
}
