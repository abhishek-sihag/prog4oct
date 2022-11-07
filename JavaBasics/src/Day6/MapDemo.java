package Day6;
/*
 * Map(I) - is not part of Collection
 *    - if you want to store values in form of 'key'&'value'
 *    - duplicates keys are not allowed
 *    - duplicates values allowed
 *    - null keys allowed only - once
 *    - null values allowed
 * 
 *  Map(I) - SortedMap(I)
 *              - TreeMap(C)
 *                  - insert entries in sorting order
 *          - HashMap(C)
 *              - Won't maintain insertion order
 *          - LinkedHashMap(C)
 *                  - Insertion order maintained 
 *          - HashTable(C) -1.0v - legacy class
 *                         - Thread safe
 *                         - methods are synchronized
 *                         - doesn't allow null key & value
 *                         - performance low
 * 
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {
	public static void main(String[] args) {
		/*
		Map<String ,Integer> marks=new HashMap();
		
		//insert values
		marks.put("Ram", 98);
		marks.put("Sam", 87);
		marks.put("Ravi", 78);
		marks.put("Sam", 90);
		marks.put("Ravi", 70);
		marks.put(null, null);
		marks.put(null, null);
		marks.put("Krish", null);
		marks.put("Ajay", 90);
		
		System.out.println(marks); //{null=null, Krish=null, Ravi=70, Sam=90, Ajay=90, Ram=98}
		
		//read
		System.out.println();
		System.out.println(marks.get("Ravi"));
		//iterate Map obj
		//convert Map to Set
		Set<Entry<String,Integer>> setObj=marks.entrySet();
		for(Entry<String,Integer> el:setObj) {
			System.out.println("Key: "+el.getKey());
			System.out.println("Value: "+el.getValue());
		}
		//option 2
		System.out.println();
		Iterator<Entry<String, Integer>> it=setObj.iterator();
		while(it.hasNext()) {
			System.out.println(it.next()+" ");
		}
		
		//search
		System.out.println();
		System.out.println("Ajay is there: "+marks.containsKey("Ajay"));
		System.out.println("null is there: "+marks.containsKey(null));
		System.out.println("Empty?: "+marks.isEmpty());
		
		//remove
		marks.remove("Sam");
		System.out.println("After removing Sam: "+marks);
		
		
		//replace
		*/
		
		/*
		//LinkedHashMap
       Map<String ,Integer> marks1=new LinkedHashMap();
		
		//insert values
		marks1.put("Ram", 98);
		marks1.put("Sam", 87);
		marks1.put("Ravi", 78);
		marks1.put("Sam", 90);
		marks1.put("Ravi", 70);
		marks1.put(null, null);
		marks1.put(null, null);
		marks1.put("Krish", null);
		marks1.put("Ajay", 90);
		
		System.out.println(marks1); //{Ram=98, Sam=90, Ravi=70, null=null, Krish=null, Ajay=90}
		
		//read
		System.out.println();
		System.out.println(marks1.get("Ravi"));
		//iterate Map obj
		//convert Map to Set
		Set<Entry<String,Integer>> setObj=marks1.entrySet();
		for(Entry<String,Integer> el:setObj) {
			System.out.println("Key: "+el.getKey());
			System.out.println("Value: "+el.getValue());
		}
		//option 2
		System.out.println();
		Iterator<Entry<String, Integer>> it=setObj.iterator();
		while(it.hasNext()) {
			System.out.println(it.next()+" ");
		}
		
		//search
		System.out.println();
		System.out.println("Ajay is there: "+marks1.containsKey("Ajay"));
		System.out.println("null is there: "+marks1.containsKey(null));
		System.out.println("Empty?: "+marks1.isEmpty());
		
		//remove
		marks1.remove("Sam");
		System.out.println("After removing Sam: "+marks1); //{Ram=98, Ravi=70, null=null, Krish=null, Ajay=90}
		//replace
		*/
		
		
		//TreeMap -asc
		Map<String ,Integer> marks2=new TreeMap();
		
		//insert values
				marks2.put("Ram", 98);
				marks2.put("Sam", 87);
				marks2.put("Ravi", 78);
				marks2.put("Sam", 90);
				marks2.put("Ravi", 70);
//				marks2.put(null, null);
//				marks2.put(null, null);
//				marks2.put("Krish", null);
				marks2.put("Ajay", 90);
				
				System.out.println(marks2); //{Ajay=90, Ram=98, Ravi=70, Sam=90}
				
				//read
				System.out.println();
				System.out.println(marks2.get("Ravi"));
				//iterate Map obj
				//convert Map to Set
				Set<Entry<String,Integer>> setObj=marks2.entrySet();
				for(Entry<String,Integer> el:setObj) {
					System.out.println("Key: "+el.getKey());
					System.out.println("Value: "+el.getValue());
				}
				//option 2
				System.out.println();
				Iterator<Entry<String, Integer>> it=setObj.iterator();
				while(it.hasNext()) {
					System.out.println(it.next()+" ");
				}
				
				//search
				System.out.println();
				System.out.println("Ajay is there: "+marks2.containsKey("Ajay"));
//				System.out.println("null is there: "+marks2.containsKey(null));
				System.out.println("Empty?: "+marks2.isEmpty());
				
				//remove
				marks2.remove("Sam");
				System.out.println("After removing Sam: "+marks2); //{Ajay=90, Ram=98, Ravi=70, Sam=90}
				//replace
		
		//HashTable - null keys/values not allowed
		
		
		
		
		
	}

}
