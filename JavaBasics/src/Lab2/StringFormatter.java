package Lab2;

public class StringFormatter {
	public static String reverseString(String string) {
		StringBuilder sb=new StringBuilder(string);
		sb.reverse();
		return sb.toString();
	}

}
