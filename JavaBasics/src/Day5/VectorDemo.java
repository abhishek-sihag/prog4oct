package Day5;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(55);
		v.add(66);
		v.add(67);
		v.add(55);
		v.add(66);
		v.add(67);
		v.add(55);
		v.add(66);
		v.add(67);
		v.add(55);
		v.add(66);
		v.add(67);
		v.add(55);
		v.add(66);
		v.add(67);
		v.add(55);
		v.add(66);
		v.add(67);
		v.add(55);
		v.add(66);
		v.add(67);
		v.add(55);
		v.add(66);
		v.add(67);
		
		
		
		v.remove(5);
		
		System.out.println(v.capacity());
		System.out.println();
		Iterator it=v.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
