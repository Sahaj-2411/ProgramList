/*
 *  Take a String and Print the String with Its palindrome
 */
import java.util.Scanner;
class Q7
{
    public static void main()
    {
        System.out.println("Enter the String");
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String aP = Palindrome(a);
        System.out.println(a + aP);
    }
    private static String Palindrome(String a)
    {
        String original, reverse = "";
        original = a;
        int length = original.length();
        for ( int i = length - 1; i >= 0; i-- )
            reverse = reverse + original.charAt(i);
        return reverse; 
    }   
}
