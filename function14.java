// variable length arguments
// here we can take any number of arguments.
// here it will work for 0 or more than 0 elements.
// here it can be used for any primitive datatype and can intialized with any kind of variable.

import java.util.Arrays;

public class function14 
{
    public static void main(String[] args) 
    {
        fun(2 , 3 , 4 , 67 , 89 , 90 , 78 , 42);
        fun1("Seshasai" , "Hemcharan" , "Dharmateja" , "Kalyanteja");
    }
    
    static void fun(int ...v)
    {
        System.out.println(Arrays.toString(v));
    }

    static void fun1(String ...v)
    {
        System.out.println(Arrays.toString(v));
    }
}
