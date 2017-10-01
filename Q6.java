/*
 * Accept a string and change the following with the given characters
 *          a   e
 *          e   i
 *          i   o
 *          o   u
 *          u   a
 * And then print the String in Upper Case.
 */
import java.util.Scanner;
class Q6
{
    public static void main()
    {
        System.out.println("Enter the String");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        a = a.toUpperCase();
        for(int i = 0;i<=a.length()-1;i++)
        {
            char z = a.charAt(i);
            switch(z)
            {
                case 'A': System.out.print("E"); break;
                case 'E': System.out.print("I"); break;
                case 'I': System.out.print("O"); break;
                case 'O': System.out.print("U"); break;
                case 'U': System.out.print("A"); break;
                default : System.out.print(z);;
            }
        }
    }
}
