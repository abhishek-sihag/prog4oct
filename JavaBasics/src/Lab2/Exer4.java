package Lab2;

import java.util.Arrays;
import java.util.Scanner;


public class Exer4 {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter size: ");
		int n=sc.nextInt();
		System.out.println("Enter elements: ");
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Modified elements are: ");
		System.out.println();
		
		Exer4 p=new Exer4();
		p.modifyArray(arr);
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public int[] modifyArray(int [] arr) {
		Arrays.sort(arr);
		int i,j=0;
		int k=arr.length;
		
		for(i=0;i<k-1;i++) {
			if(arr[i]!=arr[i+1]) {
				arr[j++]=arr[i];
			}
		}
		arr[j++]=arr[k-1];
		while(j<k) {
			arr[j++]=0;
		}
		for(i=0;i<k-1;i++) {
			for(j=0;j<k-1;j++) 
				if(arr[j]<arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
		}
		return arr;
		
	}

}
