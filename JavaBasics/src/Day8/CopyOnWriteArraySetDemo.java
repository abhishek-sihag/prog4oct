package Day8;
/*
 * *
* CopyOnWriteArraySet
* Collection(I) <- Set(I) <- CopyOnWriteArraySet(C)
* Thread Safe
* Internally implements CopyOnWriteArrayList
* An update operation will be performed on cloned copy and there is no
*      effect on threads which are performing read operation.
* At certain point of time JVM  will synchronized both automatically
* Creates clone copy for every update operation.
* CopyOnWriteArraySet Can't perform remove operation while iterating  - UnsupportedOperationException
* Insertion Order preserved
* Duplicates not allowed
* 
* Constructors
*  CopyOnWriteArraySet();
*  CopyOnWriteArraySet(Collection c);
*  
*
* Methods
*  add()
*  addAll()
*  remove()
 */

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetDemo {
	
	public static void main(String[] args) {
		CopyOnWriteArraySet<String> s=new CopyOnWriteArraySet<>();
		s.add("A");
		s.add("C");
		s.add("D");
		s.add("A");
		s.add("B");
		
		System.out.println(s);//[A, C, D, B]
		
		//remove operation can't perform while iterating
		Iterator itr=s.iterator();
		while(itr.hasNext()) {
			
			if(itr.next().equals("A")) {
				itr.remove(); //java.lang.UnsupportedOperationException
			}
			System.out.println(itr.next());
		}
		
	}

}
