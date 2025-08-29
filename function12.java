// Block scope

public class function12 
{
    public static void main(String[] args) 
    {
        int a = 10;
        int b = 20;
        String name  = "Seshasai";
        {
                //int a = 30; // already initialized outside the block in the same method hence we cannot initialize the again. 
                a = 100; // reassign the original variable to some other value and same with the strings.
                int c = 90;
                name = "Lakshmi";
                System.out.println(name);
                System.out.println(b);
                System.out.println(c);
                System.out.println(a); 
                System.out.println(name);
                // here the values that are intialized in this block will remain in the block 
        }
        //System.out.println(c);
        // cannot use outside the block.

        // scoping in for loops
        for (int  i = 0; i < 4; i++){
            System.out.println(i); // same case for the loops
            int num = 90; 
            // int a = 20; // Duplicate local variable a
            a = 10000;
            System.out.println(a);
        }
    }
    static void random(int marks)
    {
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
    
}
