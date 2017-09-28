/*
 *  A
 *  B C
 *  D E F
 *  G H I J
 *  K L M N O
 *  
 *  A B C D E
 *  A B C D A
 *  A B C A B
 *  A B A B C
 *  A A B C D 
 */
class Q8
{
    public static void main()
    {
        String a ="ABCDEFGHIJKLMNOP";
        partA(a);
        System.out.println("\n\n\n\n");
        partB(a);
    }

    public static void partA(String a)
    {
        int n=0;
        for(int i = 0;i<=4;i++)
        {
            for(int j = 0;j<=i;j++)
            {
                System.out.print(a.charAt(n));
                n++;
            }
            System.out.println();
        }
        
    }

    public static void partB(String a)
    {
        int x = 4 , y = -1;
        for(int i = 0;i<=4;i++)
        {
            
            for(int j = 0;j<=x;j++)
            {
                System.out.print(a.charAt(j));
            }
            x--;
            for(int j1 = 0;j1<=y;j1++)
            {
                System.out.print(a.charAt(j1));
            }
            y++;
            System.out.println();
        }
    }
}