package Lab3;

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter text: ");
	String s = sc.nextLine();
	char arr[] = s.toCharArray();
	System.out.println("Total Characters: "+arr.length);
	
	String arr1[] = s.split("\r\n|\r|\n");
	System.out.println("Total Lines: "+arr1.length);
    
	String arr2[] = s.split(" ");
    System.out.println("Total Words: "+arr2.length);
    sc.close();
}

}
