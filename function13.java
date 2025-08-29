// Shadowing
// it is a practice of using the same variables with the same name using the same scope that overlaps.
// here the higher value will be hidden or shadowed.
// scope actually begins when the value is intialized to that variable.
// it will work for class variables rather than the method variables.

public class function13 
{
    static int x = 90; // this will bw shadowed at line 8
    public static void main(String[] args) 
    {
        System.out.println(x); // it will print 90
        int x = 40; // the class variable at line 4 is shadowed by this
        System.out.println(x); // here it will print 40
        fun();
    }
    static void fun()
    {
        System.out.println(x);
    }
    
}

// here the output will be 90 , 40 , 90
