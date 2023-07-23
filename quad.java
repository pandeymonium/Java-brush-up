import java.lang.*;
import java.util.*;

class quad {
	public static void main(String args[])
	{
		int a,b,c;
		double x,y;
		
		System.out.println("Enter value of a,b and c" );
		Scanner sc = new Scanner(System.in);
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
		
		x =  (-b + Math.sqrt(b*b- 4*a*c)) / (2*a) ;
		y =  (-b - Math.sqrt(b*b- 4*a*c)) / (2*a) ;
		
		
		System.out.println("roots are "+x+" and "+y);
		}
}