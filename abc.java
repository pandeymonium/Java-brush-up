import java.lang.*;
import java.util.*;

class abc
{
    public static void main(String args[])
    {
        int n,a,sum=0;
        float avg;
        int max=0;
        int min=1000000;
        System.out.println("Enter the value of n: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("Enter "+n+" numbers: ");
        for(int i=1;i<=n;i++)
        {
            a = sc.nextInt();
            sum = sum+a;
            
            if(a>  max)
            max = a;
        
            if(a< min)
            min = a;
        }
        avg = sum/n;
        System.out.println("Sum of "+n+" numbers is "+ sum);
        System.out.println("Average of "+n+" numbers is "+ (double)(sum/n));
        System.out.println("Max = "+max);
        System.out.println("Min = "+ min);
    }
}