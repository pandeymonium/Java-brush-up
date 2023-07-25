import java.util.*;

class UsdInr
{
	public static void main(String Ape[])
	{
		double usd,inr,dlr=77.56;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("USD:");

		usd = sc.nextDouble();
		
		inr = dlr * usd;
		
		System.out.println("INR:"+inr);
	}	
}