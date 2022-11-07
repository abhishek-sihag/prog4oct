package Lab1;

import java.util.Scanner;

public class Ex7 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = sc.nextInt();
		
		Ex7 a=new Ex7();
		System.out.println(a.isInc(n));
	}
	
	boolean isInc(int i) {
		if (i < 0)
	      i = -i;
	    int j = 10; 
	    int k;
	    while (i > 0) {
	        k = i % 10;
	        if (j < k)
	            return false;
	        j = k;
	        i /= 10;
	    }
	    return true;
	}

}
