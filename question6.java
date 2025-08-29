import java.util.Scanner;
public class question6 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = in.nextInt();
        System.out.print("Enter second number: ");
        int num2 = in.nextInt();
        in.close();

        int result = mulOfTwoNum(num1 , num2);
        System.out.println("result is : " + result);
    }

    static int mulOfTwoNum(int num1 , int num2)
    {
        int product = num1 * num2;
        return product;
    }
    
}
