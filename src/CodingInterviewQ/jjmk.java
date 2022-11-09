package CodingInterviewQ;

import java.util.Arrays;

public class jjmk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
String str1 = "abc";
String str2 = "xyz";
String str3 = "123";
String str4 ="";
StringBuffer sb = new StringBuffer(str4);

str4.concat(str2+str3);
str1.concat(str4);
System.out.println(sb.append(str4));
		
		
		
		
	}

}
