package CodingInterviewQ;

public class SwapingIntString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int x =5;
		int y =10;
		
		x = x+y;
		y = x-y;
		x = x-y;
		System.out.println("y value =>"+y);
		System.out.println("x value =>"+x);
		
		int i = 10;
		int j = 5;
		int z =0;		
		
	z=i;
	i=j;
	j=z;
	z=0;
	System.out.println("i value =>"+i);
	System.out.println("j value =>"+j);
	System.out.println("z value =>"+z);
	
	
	String a = "hello";
	String b = "worljanam";
	
	a = a+b;
	
	b = a.substring(0,a.length()-b.length());
	System.out.println("b value =>"+b);
	
	a = a.substring(b.length());
	System.out.println("a value =>"+a);
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
