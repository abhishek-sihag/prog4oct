package Day5;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionDemo {
	public static void main(String[] args) {
		ArrayList L=new ArrayList(5);
		L.add("Ram");
		L.add("Rahul");
		L.add("Richa");
		L.add("Ramesh");
		L.add("Sahil");
		
		L.remove(0);
		L.add(0, "Ray");
		Iterator it=L.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
