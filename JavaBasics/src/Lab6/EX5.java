package Lab6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import Lab2.Exer1;

public class EX5 {
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
		System.out.println(p.getSecondSmallest(arr, n));
	}
	
	public int getSecondSmallest(int[] num) {
		List<Integer> ls=new ArrayList<Integer>();
		
		for(int i=0;i<num.length;i++) {
			ls.add(num[i]);
		}
		Collections.sort(ls);
		return ls.get(1);
	}


}
