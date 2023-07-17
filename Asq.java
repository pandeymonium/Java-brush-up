import java.util.*;
import java.lang.*;

class area
{
	float l=30,b=40;
	Scanner sc=new  Scanner(System.in);
	float s =30;
	float base=40, h=30;
	float areaR = l*b;
	float areaT = base *h/2;
	float areaS = s*s;
}
class Asq extends area

{
	public static void main(String [] lalli)
	{
		Asq a=new Asq();
		System.out.println("Area of Rectangle:"+a.areaR);
		System.out.println("Area of Squre:"+a.areaS);
		System.out.println("Area of Triangle:"+a.areaT);
	}		
}
	