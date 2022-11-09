package CodingInterviewQ;

public class FindMinAndMaxArray {

	public static void main(String[] args) {
		int x []= {10,20,30,649,669,76,7};
		int min=x[0];
		int max=x[0];
		for(int i =0;i < x.length;i++) {
			if(x[i]<min) {
				min = x[i];	
			}else if (x[i]>max) {
				max = x[i];
			}
		}
		
		
		
		int total = 0 ;
		int avg =0;
		for(int e: x) {
			 total += e;
			 avg= total/e;
				 
			 
		}
		
		System.out.println("Avrage of the Array x :"+avg);
		System.out.println("Min value of the Array x :"+min);
		System.out.println("Max value of the Array x :"+max);
	}

}
