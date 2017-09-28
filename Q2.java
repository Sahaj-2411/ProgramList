// Accept the marks and name of student as Array
// Then Arrange the name array in descending order of marks
import java.util.Scanner;
class Q2
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Elements in the array.");
        int n = sc.nextInt();
        String a[] = new String[n];
        int b[] = new int[n];
        System.out.println("Enter the Name of the Student.");
        for(int i = 0;i<n;i++)
            a[i] = sc.next();
        System.out.println("Enter the Marks of the Student.");
        for(int i = 0;i<n;i++)
            b[i] = sc.nextInt();
            
        // Sorting the name array with referance to marks
        
        System.out.println("Sorting the Arrays ....\n\n");
        int tem;
        String temp;
        for(int i = 0;i<n-1;i++)
        {
            for(int j = 0;j<n-1;j++)
            {
                if(b[j] < b[j+1])
                {
                    tem = b[j];
                    b[j] = b[j+1];
                    b[j+1] = tem;
                    
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
                
            }
        }
        System.out.println("Sorted the Arrays !!!\n");
        
        // Printing both the arrays
        
        System.out.println("The Resulted Names with marks are..\n");
        for(int i = 0;i<n;i++)
        {
            System.out.print(a[i] + "\t");
            System.out.print(b[i] + "\n");
        }
    }
}
