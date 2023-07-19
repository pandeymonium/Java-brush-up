import java.lang.*;
import java.util.*;

class eu
{
    public static int gc(int a,int b)
    {
        if(a==0)
        return b;
    return gc(b%a, a);
    }
    
    public static void main(String[] args)
    {
		
        int a=10,b=15,g;
        g =gc(a,b);
        System.out.println("GCD("+a+","+b+")= "+g);
        
        a =35,b=10;
        g =gc(a,b);
        System.out.println("GCD("+a+","+b+")= "+g);
        
        a=31,b=2;
        g =gc(a,b);
        System.out.println("GCD("+a+","+b+")= "+g);

    }
}