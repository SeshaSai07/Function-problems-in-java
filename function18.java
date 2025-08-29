// here the vararg parameter cannot be empty this case is called as ambiguity.

import java.util.Arrays;

public class function18 
{
    public static void main(String[] args) 
    {
        //fun(2 , 3 , 4 , 67 , 89 , 90 , 78 , 42);
        // multiple(7, 6, "Seshasai" , "Hemcharan" , "Kalyanteja" , "Dharmateja");
        // demo(2 , 3 , 5 , 9 , 89);
        demo("seshasai" , "hemcharan");
        // demo(); // error : The method demo(int[]) is ambiguous for the type 
    }

    static void demo(int ...v)
    {
        System.out.println(Arrays.toString(v));
    }

    static void demo(String...v)
    {
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a , int b , String ... v)
    {
        
    }

    static void fun(int ...v)
    {
        System.out.println(Arrays.toString(v));
    }
    
    
}
