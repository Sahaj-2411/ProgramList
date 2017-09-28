//                                              Pal-Prime Number
class Q4
{
    public static void main(int n)
    {
        if(isPrime(n) && isPalindrome(n))
            System.out.println("Yes,It is a Pal-Prime Number");
        else
            System.out.println("No,Not a Pal-Prime Number");
    }
    
    private static boolean isPrime(int a)
    {
        for(int i = 2;i<a;i++)
        {
            if(a%i == 0)
                return false;
        }
        return true;
    }
    
    private static boolean isPalindrome(int a)
    {
        int n = a;
        int no = 0;
        while(n>0)
        {
            int d = n%10;
            no = d + no*10;
            n = n/10;
        }
        if(a == no)
            return true;
        else
            return false;
    }
}