// variable Arguments
// here the variable arguments should be always at the end
import java.util.Arrays;

public class function15 
{
    public static void main(String[] args) 
    {
        fun(2 , 3 , 4 , 67 , 89 , 90 , 78 , 42);
        multiple(7, 6, "Seshasai" , "Hemcharan" , "Kalyanteja" , "Dharmateja");
    }

    static void multiple(int a, int b, String ... v)
    {
        
    }

    static void fun(int ...v)
    {
        System.out.println(Arrays.toString(v));
    }
    
}
