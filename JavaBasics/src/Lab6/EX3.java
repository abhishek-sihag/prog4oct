package Lab6;

import java.util.HashMap;
import java.util.Scanner;

public class EX3 {
	
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter a num: ");
	int s=scan.nextInt();
	System.out.println("Enter elements: ");
	int[] arr=new int[s];
	for(int i=0;i<arr.length;i++) {
		arr[i]=scan.nextInt();
	}
	System.out.println(getSquares(arr));
		
	}
	
	public static HashMap getSquares(int[] arr) {
		HashMap<Integer, Integer> hm=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			//if(hm.containsKey(arr[i])==false) {
				int n=arr[i];
				hm.put(arr[i], n*n);
			//}
		}
		return hm;
	}
	

}
