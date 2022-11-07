package Day6;
/*
 * Wrapper classes - convert primitive to object type
 *                 - use in collections also
 *    primitive data types - 8 types
 *    int, long, short, byte, boolean, char, float, double
 *    
 *                
 *    int - java.lang.Integer
 *    long - java.lang.Long
 *    double - java.lang.Double
 *    short - java.lang.Short
 *    byte - java.lang.Byte
 *    boolean - java.lang.Boolean
 *    char - java.lang.Character
 *    float - java.lang.Float
 *    
 *    
 *    convert primitive to object
 *       -valueOf() - method
 *       -Autoboxing
 *       
 *    converting Object to primitive
 *       -xxxValue()
 *       -Autounboxing
 *  
 *    converting wrapper obj to String
 *    -toString()
 *    
 *    converting String to wrapper obj
 *    -valueOf()
 *    
 *    Primitive to String
 *    - valueOf()
 *    
 *    String to primitive data types
 *    -parseInt() , parseDouble()
 *    
 * 
 */

public class WrapperClassDemo {
	public static void main(String[] args) {
		int x=10;
		//valueOf() - primitive to object
		Integer x1=Integer.valueOf(x);
		System.out.println(x1.getClass().getName()); // java.lang.Integer
		
		//Autoboxing - primitive to object
		Integer x2=100;
		System.out.println(x2.getClass().getName());
		
		
		//xxxValue() - object to primitive
		// Integer obj
		Integer y1=new Integer(10);
		Integer y2=new Integer(100);
		
		//intValue() - object to primitive 
		int y3=y1.intValue();
		System.out.println(y1);
		System.out.println(y3);
		
		//AutoUnboxing - object to primitive
		int y4=y2;
		System.out.println(y2);
		System.out.println(y4);
		
		
		//toString() - converting Wrapper obj to String
		System.out.println(x1.getClass().getName());
		String str1= x1.toString();
		System.out.println(str1.getClass().getName()); // java.lang.String
		
		//valueOf() - convert String to Wrapper object
		Integer i1=Integer.valueOf(str1);
		System.out.println(i1.getClass().getName());
		
		//valueOf() - primitive to String
		String str2=String.valueOf(20.02f);
		System.out.println(str2.getClass().getName());
		
		//parseXXX() - String to primitive
		double d= Double.parseDouble("2000.00");
		System.out.println(d);
	}

}
