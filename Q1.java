// Accept an array and Sort it using bubbleort technique...
import java.util.Scanner;
class Q1
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Elements in the array.");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the Elements in the array.");
        for(int i = 0;i<n;i++)
            a[i] = sc.nextInt();
        
        //Starting The Bubble Sort Algorithm
        int temp;
        for(int i = 0;i<n-1;i++)
        {
            for(int j = 0;j<n-1;j++)
            {
                if(a[j] > a[j+1])
                {
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
                
            }
        }
        
        // Printing the Array
        
        System.out.println("Printing Elements in the array.");
        for(int i = 0;i<n;i++)
            System.out.print(a[i] + "\t");
    }
}
