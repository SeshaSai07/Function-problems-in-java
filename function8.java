public class function8 
{
    public static void main(String[] args) 
    {
        int a = 10;
        int b = 20;

        swap(a , b);
        System.out.println(a + " " + b);

        String name = "Sesha";
        changeName(name);
        System.out.println(name);
    }

    public static void changeName(String name)
    {
        name = "Sai"; // here we are creating the new object
    }

    public static void swap(int a , int b)
    {
        int temp = a;
        a  = b;
        b = temp;
    }
    // here the numbers won't change.
    // Even in the case of Strings the values doesn't change.
}
