import java.lang.*;
import java.util.*;

class bitwisedemo {
	public static void main(String args[])
	{
		int a,b;
		System.out.print("a= ");
		Scanner sc= new Scanner(System.in);
		a=sc.nextInt();
		System.out.print("b= ");
		b=sc.nextInt();
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("a="+a+"  b="+b);
		
	}
}	