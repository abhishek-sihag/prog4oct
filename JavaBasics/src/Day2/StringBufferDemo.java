package Day2;

public class StringBufferDemo {
	
	public static void main(String[] args) {
		
		StringBuffer sb1 =new StringBuffer("Hello");
		StringBuffer sb2 =new StringBuffer("Hello");
		StringBuffer sb3 =sb1;
		StringBuffer sb4 =new StringBuffer();
		//mutable
		// sb1.append(" World");
		
		//System.out.println(sb1); //Hello World
		//System.out.println(sb1); //Hello World
		
		System.out.println(sb1); //Hello
		System.out.println(sb2); //Hello
		System.out.println(sb3); //Hello
		
		System.out.println();
		//comparison - == - rel comparison / equals() rel comparison
		System.out.println(sb1==sb2); // false
		System.out.println(sb1==sb3); // true
		
		System.out.println(sb1.equals(sb2)); // false
		System.out.println(sb1.equals(sb3)); // true
		
		//length
		System.out.println(sb1.length()); //5
		//capacity
		System.out.println(sb1.capacity()); // 21
		
		//(oldcapacity*2)+2 = 32+2 = 34
		sb4.append("aaaaaaaaaaaaaaaaaa");
		System.out.println(sb4.length()); // 18
		System.out.println(sb4.capacity()); //34
				
		//StringBuilder
		StringBuilder sbd1=new StringBuilder("Hello");
		StringBuilder sbd2=new StringBuilder("Hello");
		StringBuilder sbd3=sbd1;
		
		System.out.println(sbd1==sbd2); // false
		System.out.println(sbd1==sbd3); // true
		
		System.out.println(sbd1.equals(sbd2)); // false
		System.out.println(sbd1.equals(sbd3)); // true
		
		System.out.println();
		//reverse() string
		String str="Hello World";
		//converting string to stringbuilder
		StringBuilder sbd4=new StringBuilder(str);
		System.out.println(sbd4 instanceof StringBuilder);
		
		sbd4.reverse();
		System.out.println(sbd4);
		
		String revString = new String(sbd4);
		System.out.println(revString instanceof String);
		System.out.println(revString);
		
		
		
	}

}
