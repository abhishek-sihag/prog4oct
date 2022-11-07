package Lab1;

import java.util.Scanner;

public class Ex3 {
	
	public static void main(String args[])  
	{    
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter a num: ");
		int c=scan.nextInt();
	 int x1=0,x2=1,x3,i;    
	 System.out.print("Series is: "+x1+" "+x2);
	    
	 for(i=2;i<c;++i)  
	 {    
	  x3 =x1 + x2;    
	  System.out.print(" "+ x3);    
	  x1 = x2;    
	  x2 = x3;    
	 }    
	  
	}

}
