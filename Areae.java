import java.lang.*;
import java.util.*;

class Areae {
	
	public static void main(String args[])
	{
		int a,b,c;
		float s;
		double area;
		//float s,area;
		
		System.out.println("Enter 3 Sides of Triangle ");
		Scanner sc= new Scanner(System.in);
		a= sc.nextInt();
		b= sc.nextInt();
		c= sc.nextInt();
		
		s = (a+b+c)/2f;
		
		System.out.println("Semi-Perameter="+s);
		
		area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		
		System.out.println("Area="+area);
	}	
	
}