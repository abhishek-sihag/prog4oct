package Lab1;

import java.util.Scanner;

public class Ex2 {
	
	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your choice");
		System.out.println("1. Red");
		System.out.println("2. Yellow");
		System.out.println("3. Green: ");
		int c = sc.nextInt();
		
		switch(c) {
		case 1:
			System.out.println("Stop!");
			break;
		case 2:
			System.out.println("Ready!");
		case 3:
			System.out.println("Go!");
		}
			
		
	}

}
