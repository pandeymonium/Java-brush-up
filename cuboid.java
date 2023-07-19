import java.lang.*;
import java.util.Scanner;

class cuboid
{
	public static void main(String args[])
	
	{
		int l,b,h,area,volume;
		
		System.out.println("Enter Length,Width and Height (unit m) : ");
			
		Scanner sc = new Scanner(System.in);
			l = sc.nextInt();
			b = sc.nextInt();
			h = sc.nextInt();
		
		area = 2* ((l*b)+(l*h)+(b*h));
		volume = l*b*h;
		System.out.println("Area and Volume of Cuboid are :"+area+"m2 and "+volume+"m3 respectively"); 
	}
}