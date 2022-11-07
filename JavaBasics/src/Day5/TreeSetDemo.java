package Day5;

import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		
		TreeSet t=new TreeSet();
//		t.add("S");
		//t.add(3); only homogeneous obj allowed
		//t.add(null);  //not allowed to add null
//		t.add("D");
//		t.add("E");
		
		
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("D"));
		t.add(new StringBuffer("B"));
		System.out.println(t);
		
		}

}
