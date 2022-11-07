package Day5;

import java.util.LinkedList;

public class CollectionDemo2 {
	public static void main(String[] args) {
		LinkedList Ll=new LinkedList();
		Ll.addFirst("Abhi");
		Ll.addLast("Shek");
		
		Ll.add(1, "Er");
		
		System.out.println(Ll.getFirst());
		System.out.println(Ll.get(1));
		System.out.println(Ll.getLast());
	}

}
