// Given a String . Find all palindrome substrings
import java.util.Scanner;
class Q5
{
    public static void main()
    {
        // Taken the String..
        System.out.println("Enter the String");
        Scanner a = new Scanner(System.in);
        String a1 = a.nextLine();
        
        // Initiating the Scanner at the same String
        
        Scanner b = new Scanner(a1);
        
        int words=0;;
        for(int i = 0;i<a1.length();i++)
            if(Character.isWhitespace(a1.charAt(i)))
                words++;
        
        for(int i = 0;i<=words;i++)
        {
            String z = b.next();
            if(isPalindrome(z))
                System.out.println(z);
        }
        
        
        
    }
    
    private static boolean isPalindrome(String a)
    {
   
      String original, reverse = "";
      original = a;
 
      int length = original.length();
 
      for ( int i = length - 1; i >= 0; i-- )
         reverse = reverse + original.charAt(i);
 
      if (original.equals(reverse))
         return true;
      else
         return false;
 
    }
}