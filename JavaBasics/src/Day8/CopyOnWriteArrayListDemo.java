package Day8;
/*
 * * CopyOnWriteArrayList
	* Collection(I) <- List(I) <- CopyOnWriteArrayList(C)
	* Creates a cloned copy of underlying ArrayList for every update operation.
	* At certain point of time JVM  will synchronized both automatically
	* An update operation will be performed on cloned copy and there is no
	*      effect on threads which are performing read operation.
	* Creates clone copy for every update operation.
	* CopyOnWriteArrayList can perform remove operation while reading elements
	* ArrayList Can't perform remove operation while iterating  - UnsupportedOperationException
	* 
	* Constructors
	*  CopyOnWriteArrayList();
	*  CopyOnWriteArrayList(Collection c);
	*  CopyOnWriteArrayList(Object[] arr);
	*
	* Methods
	*  boolean addIfAbsent(Object o) - added only if list doesn't contain obj
	*  int addAllAbsent(Collection c) -
	*      collection of elements added to list, if elements are absent
	*        returns number of elements are added
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
	
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("aa");
		al.add("ba");
		al.add("ca");
		al.add("aa");
		al.add("ba");
		al.add("ca");
		System.out.println("ArrayList");
		System.out.println(al);
		System.out.println();
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			String str= (String)itr.next(); //ConcurrentModificationException
			if(str.equals("ca")) {
				al.remove(str);
			}
		}
		
		
		CopyOnWriteArrayList<String> cal = new CopyOnWriteArrayList<>();
		cal.addIfAbsent("aa");
		cal.addIfAbsent("ba");
		cal.addIfAbsent("ca");
		cal.addIfAbsent("ba");
		cal.addIfAbsent("ca");
		
		
		System.out.println(cal); //[aa, ba, ca]
		
		CopyOnWriteArrayList<String> cal1 = new CopyOnWriteArrayList<>();
		cal1.addIfAbsent("ab");
		cal1.addIfAbsent("ab");
		cal1.addIfAbsent("cb");
		cal1.addIfAbsent("bb");
		cal1.addIfAbsent("cb");
		
		// add cal1 elementes into cal 
		cal.addAllAbsent(cal1);
		
		//System.out.println(cal); //[aa, ba, ca, ab, cb, bb]
		
		System.out.println("Iterate");
		// iterate
		//Iterator itr1 = cal.iterator();
		
		Iterator itr1 = cal.iterator();
		while(itr1.hasNext()) {
			//String str = (String)itr1.next();
			if(itr1.next().equals("cb")) {
				itr1.remove(); //java.lang.UnsupportedOperationException
			}
		}
		System.out.println();
		System.out.println(cal);
	}

}
