import java.lang.*;
import java.util.Scanner;

class main 
{
    static void bb(int ape[])
    {
        int n = ape.length;
        for(int times=1;times <= n-1;times++)
        {
            for(int j=0;j<= n-times -1;j++)
            {
                if(ape[j]>ape[j+1])
                {
                    ape[j] = ape[j] + ape[j+1];
					ape[j+1] = ape[j] - ape[j+1];
					ape[j] = ape[j] - ape[j-1];
                }
            }
        }
    }
    
    public static void main(String args[])
    {
        int ape[] ={6,4,8,3,5,7};
        bb(ape);
        for(int i=0;i<ape.length;i++)
        {
            System.out.println(ape[i]);
        }
    }
}