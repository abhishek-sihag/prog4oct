package Day5;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class CollectionDemo3 {
	
	public static void main(String[] args) {
	Collection values=new ArrayList();
	values.add(4);
	values.add(3);
	values.add(7);
	
	System.out.println(values);
	
	Iterator it=values.iterator();
//	System.out.println(it.next());
//	System.out.println(it.next());
//	System.out.println(it.next());
	 while(it.hasNext()) {
		 System.out.println(it.next());
	 }
}
}
