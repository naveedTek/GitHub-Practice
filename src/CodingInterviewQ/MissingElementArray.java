package CodingInterviewQ;

public class MissingElementArray {
	
	
	

	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int missing []= {1,2,3,5};
		int find []= {1,2,3,4,5};
		int sum =0;
		int sum1=0;
		for(int i = 0; i <= missing.length-1; i++) {
			sum+=missing[i];
		}
		
		System.out.println();

	for(int j = 0 ; j<= find.length-1; j++) {
		sum1+=find[j];
	}
	
	int res = sum1-sum;
	
	System.out.println(res);

	}

}
