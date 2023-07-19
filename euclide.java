import java.util.*;
import java.lang.*;

class euclide {
	// extended Euclidean Algorithm
	public static int gcdExtended(int a, int b, int x, int y)
	{
		// Base Case
		if (a == 0) {
			x = 0;
			y = 1;
			return b;
		}

		int x1 = 1, y1 = 1; // To store results of recursive call
		int gcd = gcdExtended(b % a, a, x1, y1);

		// Update x and y using results of recursive
		// call
		x = y1 - (b / a) * x1;
		y = x1;

		return gcd;
	}

	// Driver Program
	public static void main(String[] args)
	{
		int x = 1, y = 1;
		int a = 45, b = 15;
		Scanner sc = new Scanner(System.in);
		System.out.print("a= ");
		a = sc.nextInt();
		System.out.print("\nb= ");
		b = sc.nextInt();
		int g = gcdExtended(a, b, x, y);
		System.out.print("gcd(" + a + ", " + b + ") = " + g);
	}
}