package Lab6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ExampleInputUser {
	
	

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		ArrayList<String> hm=new ArrayList<>();
		
		System.out.println("Enter size: ");
		int n=sc.nextInt();
		
		System.out.println("Enter elements: ");
		for(int i=0;i<n;i++) {
			hm.add(sc.next());
		}
		
		
		System.out.println(hm);
		
	
	}

}
