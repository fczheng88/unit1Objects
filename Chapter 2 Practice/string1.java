public class string1
{
    public static void main( String[] args)
    {
        String greeting = "hello, World!";
        int length = greeting.length();
        System.out.println("length = " + length);
        
        String river = "Mississippi";
        String bigRiver = river.toUpperCase();
        System.out.println("river: " + river + " bigRiver: " + bigRiver);
    }
}