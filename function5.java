public class function5 
{

/*
 return_type name (arguments) 
 {
 // body
 return statement;
 }
 */
    
// pass the value of numbers when you are calling the method in main() we can do that by passing the parameters

    public static void main(String[] args) 
    {
        int ans = sum3(20 , 40);
        System.out.println(ans);    
    }

    static int sum3(int a , int b)
    {
        int sum = a + b;
        return sum;
    }
    
}
