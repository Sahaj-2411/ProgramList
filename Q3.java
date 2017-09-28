/* Pattern Program
 * 5 4 3 2 1
 *   4 3 2 1
 *     3 2 1
 *       2 1
 *         1
 *       2 1
 *     3 2 1
 *   4 3 2 1
 * 5 4 3 2 1
 */
class Q3
{
    public static void main()
    {
        int a;
        for(int i = 5;i>=1;i--)
        {
            a = 5-i;
            for(int k = 1;k<=a;k++)
                System.out.print(" ");
                
            for(int j = i;j>=1;j--)
                System.out.print(j);
                
            System.out.println();
        }
        
        
        for(int i = 2;i<=5;i++)
        {
            a = 5-i;
            for(int k = 1;k<=a;k++)
                System.out.print(" ");
                
            for(int j = i;j>=1;j--)
                System.out.print(j);
                
        System.out.println();
        }
        
    }
}