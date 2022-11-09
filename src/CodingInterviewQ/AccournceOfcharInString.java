package CodingInterviewQ;

public class AccournceOfcharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String st = "love java";
		int count=0;
		
		char [] x = st.toCharArray();
				
		
		for(char e: x) {
			if(e == 'o') {
				
				
				count++;
			}
		}
		
		System.out.println(count);
		

	}

}
