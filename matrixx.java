import java.lang.*;

class matrixx
{
	public static void main (String[] args)
	{
		int m1[][]={{1,1,1,1}, {2,2,2,2}, {3,3,3,3}, {6,6,6,6} };
		int m2[][]={{4,4,4,4}, {5,5,5,5}, {6,6,6,6}, {3,3,3,3} };
		int m3[][]= new int[4][4];
		
		System.out.println("Add \n");
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				m3 [i][j]=m1[i][j]+m2[i][j];
				System.out.print(m3[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("\nSub \n");
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				m3 [i][j]=m1[i][j]-m2[i][j];
				System.out.print(m3[i][j]+" ");
			}
			System.out.println();
		}
	
	}
}