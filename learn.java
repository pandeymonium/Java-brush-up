import java.lang.*;

class ape extends Thread
{
    public void run()
    {
        try
        {
            System.out.println("Thread "+Thread.currentThread().getId()+" running");
        }
        catch (Exception e)
        {
            System.out.println("here is an Exception");
        }
        
    }
}

public class learn
{
    public static void main(String args[])
    {
		int n=8;
        for(int i=0;i<n;i++)
        {
            ape a= new ape();
            a.start();   
        }
        
    }
}