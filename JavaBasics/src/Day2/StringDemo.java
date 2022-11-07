package Day2;

/*
 * String
 * sequence of char
 * java.lang.String
 * immutable
 * 
 * ways to create string
 *  string literals - String constant pool (scp)
 *  new keyword - heap area
 *  
 */

public class StringDemo {
	
	public static void main(String[] args) {
		
		//String Literals
		String str1="hello";
		String str2="world";
		String str5="hello";
		String str7 = str1;
		
		str1.concat("world");
		
		//using new keyword
		String str3= new String("Hello");
		String str4=new String("World");
		String str6=new String("Hello");
		String str8=str3;
		
		//compare string objects - == or equals()
		
		//String str1="hello";
		//String str2="world";
		//String str5="helloo";
		
		System.out.println(str1==str5); // reference comparison
		System.out.println(str1.equals(str5)); // content comparison
		
		System.out.println(str1==str7); // reference comparison
		System.out.println(str1.equals(str7)); // content comparison
		
		System.out.println();
		System.out.println(str3==str8); // reference comparison
		System.out.println(str3.equals(str8)); // content comparison
		
		System.out.println(str3==str6); // false
		System.out.println(str3.equals(str6)); // true
		
		System.out.println();
		System.out.println(str1==str6); // false
		System.out.println(str1.equals(str6)); // true
		
		// compareTo()
		// 1st string > 2nd string - +ve
		// 1st string < 2nd string - -ve
		// 1st string == 2nd string - 0
		// str1 = "hello", str6="Hello" - h-104, H-72
		System.out.println();
		System.out.println(str1.compareTo(str6)); // +ve value - 104-72 = 32
		System.out.println(str6.compareTo(str1)); // -ve value - 72-104 = -32
		System.out.println(str3.compareTo(str6)); // 0
		
		//methods
		//String str1="hello"
		//length
		System.out.println(str1.length()); //5
		//charAt
		System.out.println(str1.charAt(4)); //0
		// System.out.println(str1.charAt(5)); //String index out of bounds exception
		//contains
		System.out.println(str1.contains("ll")); // true
		// startsWith
		System.out.println(str1.startsWith("he")); //true
		System.out.println(str1.toLowerCase()); // hello
		System.out.println(str1.toUpperCase()); // HELLO
		
		System.out.println(str1.substring(2));  // llo
		System.out.println(str1.substring(1, 3)); //el
		
		//trim
		String str10="   Hello World    ";
		System.out.println(str10);
		System.out.println(str10.trim());
		
		//split
		String str11="Hello World";
		String[] strArr1 = str11.split(" ");
		for(String s: strArr1) {
			System.out.println(s); //Hello, World
		}
		
		
		
	}

}
