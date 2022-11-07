package Lab3;

import java.util.*;

public class Ex2 {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter String: ");
		String str2=scan.next();
		
		Ex2 p=new Ex2();
		p.getImage(str2);
		
	}
	public void getImage(String str) {
		String str1=str;
		String rev=new StringBuffer(str1).reverse().toString();
		System.out.println(str1+"|"+rev);
	}

}
