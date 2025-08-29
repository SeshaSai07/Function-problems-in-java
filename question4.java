// A person can votes if age is greater than or equal to 18.
import java.util.Scanner;
public class question4 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        boolean sol = isEligibleOrNot(age);
        System.out.println(sol);
    }

    static boolean isEligibleOrNot(int age)
    {
        return age >= 18;
    }
    
}
