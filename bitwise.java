import java.lang.*;

class bitwise{
    public static void main(String args[]){
        byte a=9;
        byte b=12;
        
        byte c;
        
        c = (byte)(a<<4);
        c = (byte)(c|b);
        
        System.out.println((byte) ((c&0b11110000)>>4));
        System.out.println((byte) ((c&0b00001111)));
		
		int u=25;
        int v=15;
        int x= u|v;
        int y= u&v;
        System.out.println(Integer.toBinaryString(u)+(" Also ")+(u));
        System.out.println(Integer.toBinaryString(v)+(" Also ")+(v));
        System.out.println(Integer.toBinaryString(x)+(" Also (OR) ")+(x));
        System.out.println(Integer.toBinaryString(y)+(" Also (AND) ")+(y));
    }
}