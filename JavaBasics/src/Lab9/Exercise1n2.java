package Lab9;

import java.util.Scanner;

@FunctionalInterface
interface If1{
	double pow(int x,int y);
}

@FunctionalInterface
interface If2{
	String exer();
}

public class Exercise1n2 {
	
	public static void main(String[] args) {
		
		If1 a= (x, y) -> (Math.pow(x,y));
		System.out.println("pow ans: "+a.pow(10, 2));//100
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string: ");
		String str=sc.nextLine();
		If2 b = () -> {
			StringBuilder res=new StringBuilder();
			for(int i=0;i<str.length();i++) {
			if(i>0) {
				res.append(" ");
			}
			res.append(str.charAt(i));
			}
			return res.toString();
			
		}; System.out.println(b.exer());
		
	
	}

}
