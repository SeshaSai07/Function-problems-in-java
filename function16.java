// Function overloading
// here the function names can be same but the parameters must be different.
// it decides which function to run during the compile time execution.
public class function16 
{

    public static void main(String[] args) 
    {
        fun(78);
        fun("Sesha sai");
    }
    
    static void fun(int a) 
    {
        System.out.println(a);
    }

    static void fun(String name)
    {
        System.out.println(name);
    }
    
}
