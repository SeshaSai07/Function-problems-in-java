import java.util.Scanner;
public class question9 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println(findSum(num));
    }

    static int findSum(int num)
    {
        return num * (num + 1) / 2;

    }
    
}
