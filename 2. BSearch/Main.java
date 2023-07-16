import java.util.Scanner;
class Main
{
    public static int lsearch(int a[],int key)
    {
        for(int i=0;i<a.length;i++)
        {
            if (a[i]==key)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main (String args[])
  {
    int a[] = { 2, 3, 4, 10, 40 };
    Scanner sc = new Scanner (System.in);
    System.out.print("Enter the number for search :");
    int key = sc.nextInt ();
    int index = lsearch(a,key);
    if(index!=-1)
    {
        System.out.println(key+" is at index "+index);
    }
    else
    {
        System.out.println(key+" is not present");
    }

  }
}
