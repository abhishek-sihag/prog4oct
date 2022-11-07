package Day2;

public class StringBuilderDemo {
	
	public static void main(String[] args) {
		
		StringBuilder std1 = new StringBuilder("Lucifer");
		StringBuilder std2 = new StringBuilder("Buf");
		
		
		System.out.println();
		System.out.println(std1.length());
		System.out.println(std1.capacity());
		
		System.out.println(std2.length());
		System.out.println(std2.capacity());
		
		
		StringBuffer bt1 = new StringBuffer("Buffer");
		StringBuffer bt2 = new StringBuffer("Buf");
		StringBuffer bt3 = bt2;
		
		System.out.println();
		System.out.println(bt1.length());
		System.out.println(bt1.capacity());
		
		System.out.println(bt2.length());
		System.out.println(bt2.capacity());
		
		System.out.println(bt3.length());
		System.out.println(bt3.capacity());
		
		System.out.println(bt3==bt2);
		System.out.println(bt1.equals(std2));
		System.out.println(bt1.compareTo(bt3));
		
		
		
		
	}

}
