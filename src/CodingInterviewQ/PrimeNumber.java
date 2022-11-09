package CodingInterviewQ;

public class PrimeNumber {
	
	
	
	public static boolean primeNum(int num ) {
		if (num <= 1) {
			
			return false;
			
		} 
		
		for(int i =2; i<num; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		
		
		return true;
			
	}
	
	public static void enterPrime(int num) {
		System.out.print("these are the prime numbers : ");
		for(int j = 2; j<num; j++) {
			if(primeNum(j)) {
				System.out.print(j+" ");
			}
			
			
		}
		System.out.println();
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.out.println(primeNum(3));
		enterPrime(6);
		enterPrime(13);
		enterPrime(20);
		enterPrime(30);
	}

}
