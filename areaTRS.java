import java.lang.*;
import java.util.*;

class sides
{
	double s,l,b,base,height;
	
	 void Squresides()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of sides of Squre: ");
		s = sc.nextDouble();
	}
	 void trianglesides()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of base of triangle: ");
		base =sc.nextDouble();
		System.out.print("Enter the value of height of triangle: ");
		height = sc.nextDouble();
	}
	 void rectanglesides()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of length of rectangle: ");
		l = sc.nextDouble();
		System.out.print("Enter the value of Width of rectangle: ");
		b = sc.nextDouble();
	}		
}

class area extends sides
{
	 double Squrearea()
	{
		double sqArea =  s*s;
		return(sqArea);
		//System.out.println("Area of Squre:"+(s*s));
	}
	
	 double Trianglearea()
	{
		double triArea = height*base/2;
		return(triArea);
		//System.out.println("Area of triangle:"+triArea);
	}

	 double Rectanglearea()
	{
		double rectArea = l*b;
		return(rectArea);
		//System.out.println("Area of rectangle:"+rectArea);
	}	
}

class areaTRS extends area
{
	public static void main(String args[])
	{
		sides si=new sides();
		si.Squresides();
		area ar= new area();
		System.out.println("Squre:"+ar.Squrearea());
		
		si.trianglesides();
		System.out.println("Triangle:"+ar.Trianglearea());
		
		si.rectanglesides();
		System.out.println("Rectangle"+ar.Rectanglearea());
	}
}
	