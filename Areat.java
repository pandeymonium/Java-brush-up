import java.lang.*;
import java.util.*;
class Areat
{
	public static void main( String args[])
	{
		float a,b,c;
		System.out.println(" Type Height and Base ");
		Scanner sc = new Scanner(System.in);
		a=sc.nextFloat();
		//System.out.println("Base ");
		//Scanner sc = new Scanner(System.in);
		b=sc.nextFloat();
		c = a*b/2;
		System.out.println("Area "+c);		
	}	
}