package CodingInterviewQ;

public class RevInteger {

	public static void main(String[] args) {
		
		
		int  i = 206;
		
		int rev =0;
		
		while (i !=0) {
			
		rev =	rev * 10 + i% 10;
		i = i /10;
			
			
		}
		System.out.println(rev);
		// TODO Auto-generated method stub
		System.out.println(60.6%10);

	}

}
