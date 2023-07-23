import java.util.Scanner;

class usd {
    public static void main(String lalit [])
    {
        char a;
        double d,i,v=77.56;
        Scanner sc = new Scanner(System.in);
        System.out.println("Press D for USD and Press I for INR:");
        a = sc.next().charAt(0);
        switch(a)
        {
            case'D':
            System.out.print("USD:");
            d = sc.nextDouble();
            i = d*v;
            System.out.println("INR:"+i);
            break;
            case'I':
            System.out.print("INR:");
            i =sc.nextDouble();
            d = i/v;
            System.out.println("USD:"+d);
            break;
            default:
            System.out.println("Press D or I, Thank you.");

        }
    }
}