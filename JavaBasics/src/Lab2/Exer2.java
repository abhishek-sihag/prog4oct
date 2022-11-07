package Lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Exer2 {
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size: ");
		int n=sc.nextInt();
		System.out.println("Enter element/s: ");
		String[] arr=new String[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.next();
		}
		Exer2 b=new Exer2();
		arr=b.sortString(arr);
		for(int i=0;i<n;i++) {
			System.out.println("Result is:"+arr[i]);
		}
		sc.close();
	}
	
	String[] sortString(String[] arr) {
		
		String[] s=arr;
		int n=s.length;
		for(int i=0;i<n;i++) {
			arr[i]=arr[i].toLowerCase();
		}
		Arrays.sort(arr);
		
		if(s.length%2==0){
			for(int i=0;i<s.length/2;i++) {
				s[i]=s[i].toUpperCase();
			}for(int i=s.length/2;i<s.length;i++) {
				s[i]=s[i].toLowerCase();
			}
			}
		else {
			for(int i=0;i<s.length/(2+1);i++) {
				s[i]=s[i].toUpperCase();
			}
			for(int i=s.length/(2+1);i<s.length;i++) {
				s[i]=s[i].toLowerCase();
			}
		} return s;
	}
	
	
}
