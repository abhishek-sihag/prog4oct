package Lab1;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an integer : ");
		int n=sc.nextInt();
		
		Ex4 p=new Ex4();
		
		for(int i=0;i<=n;i++) {
			System.out.println("The no "+i+" is prime: "+p.isPrime(i));
	}
			

		
	}
	boolean isPrime(int n) {
	    //check if n is a multiple of 2
	    if (n<=2) return true;
	    if(n%2==0) return false;
	    //if not, then just check the odds
	    for(int i=3;i*i<=n;i+=2) {
	        if(n%i==0)
	            return false;
	        
	    }
	    return true;
	}
	
	
	

}
