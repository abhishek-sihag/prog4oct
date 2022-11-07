package Day5;

import java.util.TreeSet;

public class SortedSetDemo {
	public static void main(String[] args) {
		TreeSet t=new TreeSet();
		t.add("A");
		t.add("D");
		t.add("C");
		t.add("B");
		
		System.out.println(t);
		System.out.println(t.first());
		System.out.println(t.last());
		System.out.println(t.headSet("C"));
		System.out.println(t.tailSet("C"));
		System.out.println(t.subSet("B","D"));
		System.out.println(t.comparator());
		
	}

}
