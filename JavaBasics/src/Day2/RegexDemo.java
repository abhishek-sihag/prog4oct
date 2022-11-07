package Day2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Regular expressions
 * 
 * Quantifiers
 * '?' - 0-1 Occurrence of pattern 
 * '+' - 1 or more 
 * '*' - 0 or more
 * '{10}' - number of times to occur
 * '{5, 10}' - min 5 & upto 10
 * '{5, }' - min 5 & max can be any time
 * 
 * 
 *  Metacharecters
 * \d - represents single digit
 * \D - represents single non-digit
 * \s - represents space
 * \S - represents non space char
 * \w - matches word chars [a-zA-Z_$]
 * \W - matches other than word chars
 *  . - single character
 *  
 * Examples
 * a?    -  a occurs - 0 or 1
 * a+    -  a occurs once or more times
 * a*    -  a occurs 0 or more times
 * a{n}  -  a occurs n times only
 * a{n,} -  a occurs n or more times
 * a{n,m} - a occurs at least n times and less than m times
 * 
 *
 * 9962512345 - 
 *  \d\d\d\d\d\d\d\d\d\d
 *  \d{10}
 *  [0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]
 *  [0-9]{10}
 *  [0-9]? - 0 or one time
 *  String str = "1abc"; // true
 *             = "abc"; // true
 *             
 *  [0-9]+ - 1 or more
 *  String str = "1abc"; // true
 *             = "abc"; // false 
 *             
 *  userName@gmail.com - 
 *  pattern = \w+@\w+\.\w+
 *  
 *  userName@gmail.com // true
 *  userName_$@gmail%com // false
 *  
 *  userName@yahoo.co.in 
 *  pattern = \w+@\w+\.\w+\.\w{2,3}
 *          = [a-zA-Z_-]{3,}@[a-zA-Z]{3,}\.[a-zA-Z]{2}\.[a-zA-Z]{2}
 *  
 *  
 *  ip address - 10.20.30.1 - 0-255
 *             - 1.1.1.1
 *             - 201.10.1.123
 *  pattern - \d{1,3}\.\d{1,3}\.\d{1,3}\.\d{1,3}
 *          - [0-9]{0,3}\.[0-9]{0,3}\.[0-9]{0,3}\.[0-9]{0,3}
 *    
 *  flyingreturn.base@airindia.in
	     * star.retros@airindia.in
	     * 
	     * 1860 233 1407
	     * 
	     *  020-26231407
	     *  
	     *  0930 hrs - 1730 hrs
	     *  
	     *  MTNL / BSNL 
	     *  
	     *  + 91 124 2641407 (International call rates applicable)
	     *  
	     *  Mr.
	     *  Mrs.
	     *  
	     *  find(), start(),
 */



public class RegexDemo {
	
	public static void main(String[] args) {
		//case 1
		String str = "10.202.30.1";
		Pattern p = Pattern.compile("(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})");
		Matcher m = p.matcher(str);
		System.out.println(m.matches()); // true
		System.out.println(m.group()); // 10.202.30.1
		System.out.println(m.group(1)); // 10
		System.out.println(m.group(2)); // 202
		System.out.println(m.group(3)); // 30
		System.out.println(m.group(4)); // 1
		
		//case 2 - matches 2 char, 1st char can be anything
		boolean b2=Pattern.compile(".s").matcher("*s").matches();
		System.out.println(b2);
		
		//case 3
		boolean b3=Pattern.matches("[0-9]{10}", "9873548987"); //true
		System.out.println(b3);
		
		String contactNo = "124 2641487";
		System.out.println();
		// System.out.println(Pattern.matches("\\d{3}\\s{1}\\d{7}", contactNo));
		Pattern p1 = Pattern.compile("(\\d{3})\\s{1}(\\d{7})");
		Matcher m1 = p1.matcher(contactNo);
		System.out.println(m1.matches()); // true
		System.out.println(m1.group()); // 124 2641487
		System.out.println(m1.group(1)); // 124
		System.out.println(m1.group(2)); // 2641487
		
		if(Integer.parseInt(m1.group(1))!=124) {
			System.out.println("std code not matching.");
		}
		
		// case 4
		String helpLine ="1800 233 1407";
		System.out.println();
		Pattern p2 = Pattern.compile("(\\d{4})\\s{1}(\\d{3})\\s{1}(\\d{4})");
		Matcher m2 = p2.matcher(helpLine);
		System.out.println(m2.matches());
		System.out.println(m2.group());
		System.out.println(m2.group(1));
		System.out.println(m2.group(2));
		System.out.println(m2.group(3));
		
		//case 5
		String nom = "020-26231407";
		System.out.println();
		Pattern p3 = Pattern.compile("0"+"(\\d{2})"+"-"+"(\\d{8})");
		Matcher m3 = p3.matcher(nom);
		System.out.println(m3.matches());
		System.out.println(m3.group());
		System.out.println(m3.group(1));
		System.out.println(m3.group(2));
		
		
		//case 6
				String nom1 = "+ 91 124 2641407";
				System.out.println();
				Pattern p4 = Pattern.compile("\\+"+" 91 "+"(\\d{3})\\s{1}(\\d{7})");
				Matcher m4 = p4.matcher(nom1);
				System.out.println(m4.matches());
				System.out.println(m4.group());
				System.out.println(m4.group(1));
				System.out.println(m4.group(2));
		
				
		// case 7  - error
		//String hr = "0930 hrs - 1730 hrs";
		//System.out.println();
		//Pattern p5 = Pattern.compile("(\\d{1})[0-2](\\d{1})[0-9](\\d{1})[0-6](\\d{1})[0-9]\\s{1}"+"hrs"+"\\s{1}"+"-"+"\\s{1}(\\d{1})[0-2](\\d{1})[0-9](\\d{1})[0-6](\\d{1})[0-9]\\s{1}"+"hrs");
		//Matcher m5 = p5.matcher(hr);
		//System.out.println(m5.matches());
		//System.out.println(m5.group());
		//System.out.println(m5.group(1));
		//System.out.println(m5.group(2));
	}

}