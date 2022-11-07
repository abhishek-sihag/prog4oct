package Lab3;

import java.util.Scanner;

public class Ex4 {
	
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter a num: ");
		String str=scan.nextLine();
		
		Ex4 p=new Ex4();
		p.modifyNumber(str);
		
		
	}
	
	public void modifyNumber(String str) {
  	  char arr[] = str.toCharArray();
  	  StringBuffer str1 = new StringBuffer();
  	 
  	  for(int i=0;i<arr.length-1;i++) {
  		  int n1=(int)arr[i];
  		  int n2=(int)arr[i + 1];
  		  if(n1-n2>0) {   
  			  str1.append(n1-n2);  
  		  }else if(n2-n1>0) {
  			  str1.append(n2-n1);
  		  }
  	  }
  	  str1.append(str.charAt(str.length()-1));
  	  System.out.println("Difference: " + str1);
    }

}
