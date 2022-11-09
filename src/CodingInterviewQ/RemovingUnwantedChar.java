package CodingInterviewQ;

public class RemovingUnwantedChar {

	public static void main(String[] args) {

		
		
		
		String name = "@##$%^Nav(*&&^%ee(*&&&^d!@!!!Ah(*&&^^mad#@@!&";
		
		 
	String remove = 	name.replaceAll("[^a-zA-Z]", "");
	System.out.println(remove);
	
	

	}
}
