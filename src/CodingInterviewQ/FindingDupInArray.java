package CodingInterviewQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class FindingDupInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//first
		
		String [] name ={"A","B","C","A"};
		for(int i = 0 ; i < name.length; i++) {
			for(int j = i+1; j<name.length; j++) {
				
				if(name[i].equals(name[j])) {
					System.out.println(name[j]);
				}
					
			}
		}
		
		
		//secend
		
		HashSet <String> find = new HashSet<String>();
		for(String e: name) {
			if(find.add(e)==false) {
				System.out.println(e);
			}
		}
		
		

	}

}
