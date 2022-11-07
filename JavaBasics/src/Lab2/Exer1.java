package Lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Exer1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter size: ");
		int n=sc.nextInt();
		
		System.out.println("Enter elements: ");
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		Exer1 p=new Exer1();
		System.out.println("Second smallest is: "+p.getSecondSmallest(arr, n));
		sc.close();
	}
	
	public int getSecondSmallest(int[] num, int a) {
		Arrays.sort(num);
		int k = 0;
		for(int i=0;i<a;i++) {
			if(i==1) {
				k=num[i];
				}
		} 
		return k;
	}

}
