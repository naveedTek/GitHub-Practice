package CodingInterviewQ;

public class RevString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//first way
		String name = "Ahmad Javeed";
		
		
		
		char [] pro = name.toCharArray();
		String rev = "";
		for(int x = pro.length-1; x >= 0 ; x--) {
			rev += pro[x];
			
		}
		System.out.print("String rev using toCharArray method 	=>"+rev);
		
		
		System.out.println();
		
		//secend way
		
		StringBuffer bf = new StringBuffer(name);
		
		System.out.print("String rev using StringBuffer revers method	 =>"+bf.reverse());
		
		System.out.println("\n"+" String rev using toCharArray method 	=>");
		
		//3rd way 
		char re = 0;
		for(int i = name.length()-1; i >= 0 ; i --) {
			re = name.charAt(i);
			System.out.print(re);

		}
		
	}

}
