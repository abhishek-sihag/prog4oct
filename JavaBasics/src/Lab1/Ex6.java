package Lab1;

import java.util.Scanner;

public class Ex6 {
	
	 
		public static void main(String[] args)   {  
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num:");
			int n = sc.nextInt();
			

			
        Ex6 h=new Ex6();
			
		
		System.out.println("The difference between the sum of the squares and the square of the sum of the n natural numbers "+h.calSum(n));
		sc.close();
		}
		
		
		int calSum(int num) {
			int i,j=0,k=0, sum = 0;  
			for(i = 1; i <= num; ++i)  
			{  
			k = k + (i*i); 
			j=j + i;
			sum=k-(j*j);
			}
			return sum;
		}

}
