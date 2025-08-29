// Scoping is nothing but where we can access our variables.
// function scope
public class function11 
{
    public static void main(String[] args) 
    {
        int a = 10;
        int b = 20;
        System.out.println(a + b); 
    }
    // here we can change the values within the function scope only outside the sunction we can not change the value.
    static void random(int marks) {
        int num = 67;
        System.out.println(num);
        System.out.println(marks);

    }
    
}
