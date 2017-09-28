/*
 * Accept a string and change the following with the given characters
 *          a   e
 *          e   i
 *          i   o
 *          o   u
 *          u   a
 */
import java.util.Scanner;
class Q6
{
    public static void main()
    {
        System.out.println("Enter the String");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        a = a.toLowerCase();
        for(int i = 0;i<=a.length()-1;i++)
        {
            char z = a.charAt(i);
            switch(z)
            {
                case 'a': System.out.print("e"); break;
                case 'e': System.out.print("i"); break;
                case 'i': System.out.print("o"); break;
                case 'o': System.out.print("u"); break;
                case 'u': System.out.print("a"); break;
                default : System.out.print(z);;
            }
        }
    }
}
