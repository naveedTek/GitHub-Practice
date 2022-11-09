package CodingInterviewQ;

public class PrintingNumwithoutLoop {
	
	
	
	public static void printNum(int num,int input) {
		if(num <=input) {
			
			System.out.println(num);
			num++;
			
			printNum(num,input);
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printNum(0,10);
		
		
		
		
	}

}
