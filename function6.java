public class function6 
{
    public static void main(String[] args) 
    {
        String personalised = myGreet("Maddineni Lakshmi Sesha Sai");
        System.out.println(personalised);   
    }

    static String myGreet(String name)
    {
        String message = "Hello " + name;
        return message;
    }
    
}
