package Lab6;
import java.util.HashMap;
import java.util.Scanner;


public class Ex2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter character array: ");
		String s=scan.nextLine();
		System.out.println(countChars(s.toCharArray()));
		
	}
	
	public static HashMap countChars(char[] a) {
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		
		for(int i=0;i<a.length;i++) {
			if(hm.containsKey(a[i])) {
				int count= hm.get(a[i]);
				hm.put(a[i], ++count);
			} else
				hm.put(a[i], 1);
		}
		return hm;
	}
}


