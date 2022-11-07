package Lab3;

import java.util.*;

public class Ex1 {
	public static void main(String[] args) {
		int sum=0;
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter num string: ");
		String str=scan.nextLine();
		System.out.println("Your entry: "+str);
		StringTokenizer s=new StringTokenizer(str," ");
		
		while(s.hasMoreTokens()) {
			int i= Integer.parseInt(s.nextToken());
			System.out.println(i);
			sum+=i;
		}
		System.out.println("sum: "+sum);
		scan.close();
		
		
	}

}
