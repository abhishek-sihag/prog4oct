package Day8;
/*
 * Collection -
 *     Vector & HashTable -  drawback: it will allow only one method
 *     Collections -
 *        synchronizedList()
 *        synchronizedSet()
 *        synchronizedMap()
 *        
 *        
 *        
 *        
 *     
 */

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrencyDemo {
	public static void main(String[] args) {
		Map<String, Integer> marks= new HashMap<>();
		marks.put("Ram", 90);
		marks.put("Sam", 67);
		marks.put("Ravi", 89);
		marks.put("Ravi", 78);
		System.out.println(marks);//{Ravi=78, Sam=67, Ram=90}
		//remove
		marks.remove("Ravi");
		System.out.println(marks);//{Sam=67, Ram=90}
		//replace
		marks.replace("Sam", 80);
		System.out.println(marks); //{Sam=80, Ram=90}
		
		ConcurrentHashMap<String, Integer> cHashMap= new ConcurrentHashMap<>();
		cHashMap.put("Ram", 90);
		cHashMap.put("Ravi", 90);
		cHashMap.put("Sam", 90);
		cHashMap.put("Ram", 79);
		
		System.out.println(cHashMap); //{Ravi=90, Sam=90, Ram=79}
		//remove
		cHashMap.remove("Ravi", 50);
		System.out.println(cHashMap); //{Ravi=90, Sam=90, Ram=79}
		cHashMap.remove("Ravi", 90);
		System.out.println(cHashMap); //{Sam=90, Ram=79}
		
		//replace
		cHashMap.replace("Sam", 100, 75);
		System.out.println(cHashMap); //{Sam=90, Ram=79}
		//without specify exact element, it'll not replace
		cHashMap.replace("Sam", 90, 75);
		System.out.println(cHashMap); //{Sam=75, Ram=79}
		
		
		
		
		
		
	}

}
