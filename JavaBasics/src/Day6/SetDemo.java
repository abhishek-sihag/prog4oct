package Day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/*
 * SET(I)
 *    - duplicates not allowed
 *    - insertion order not maintained
 *    - methods are not synchronized
 *    - null values allowed
 *    - underlying data structures HashTable
 *    
 *    HashSet(C)
 *    LinkedHashSet(C)
 *    SortedSet(I)
 *      NavigableSet(I)
 *         TreeSet(C)
 * 
 */

public class SetDemo {
	public static void main(String[] args) {
		
		Set<String> hs=new HashSet<>();
		hs.add("aa");
		hs.add("cc");
		hs.add("bb");
		hs.add("aa");
		hs.add("cc");
		hs.add("cc");
		hs.add("zz");
		hs.add("kk");
		hs.add(null);
		hs.add("10");
		
		System.out.println(hs);
		System.out.println();
		System.out.println("LinkedHashSet: ");
		Set<String> lhs=new LinkedHashSet<>();
		lhs.add("aa");
		lhs.add("cc");
		lhs.add("bb");
		lhs.add("aa");
		lhs.add("cc");
		lhs.add("cc");
		lhs.add("zz");
		lhs.add("kk");
		lhs.add(null);
		lhs.add("10");
		
		System.out.println(lhs);
		
		System.out.println("LinkedHashSet: ");
		Set<Integer> lhs1=new LinkedHashSet<>();
		lhs1.add(100);
		lhs1.add(10);
		lhs1.add(50);
		lhs1.add(25);
		lhs1.add(50);
		lhs1.add(25);
		
		System.out.println(lhs1);
		System.out.println();
		
		System.out.println("TreeSet: ");
		Set<Integer> ts=new TreeSet<>();
		ts.add(100);
		ts.add(10);
		ts.add(50);
		ts.add(25);
		ts.add(50);
		ts.add(25);
		
		
		System.out.println("TreeSet: ");
		Set<Integer> ts2=new TreeSet<>();
		ts2.add(1000);
		ts2.add(1000);
		ts2.add(5000);
		ts2.add(2500);
		ts2.add(5000);
		ts2.add(2500);
		// ts.add(null); //nullpointerexception
		System.out.println("Before add: ");
		System.out.println(ts);
		System.out.println();
		
		//add collection
		ts.addAll(ts2);
		System.out.println("After add: "+ts);
		
		//remove collection
		System.out.println("Aftet removing: ");
		ts.removeAll(ts2);
		System.out.println(ts);
		System.out.println();
		ts.remove(100);
		System.out.println(ts);
		
		
		System.out.println();
		System.out.println("TreeSet: ");
		Set<Character> ts1=new TreeSet<>();
		ts1.add('z');
		ts1.add('e');
		ts1.add('s');
		ts1.add('m');
		ts1.add('i');
		System.out.println(ts1);
		
		//iterator set
		System.out.println();
		for(Character c:ts1) {
			System.out.println(c);
		}
		
		System.out.println();
		Iterator it=ts.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//search
		System.out.println();
		System.out.println(ts1.contains('c'));
		
		System.out.println(ts1.add('w')); //in character type cannot integer
		System.out.println(ts1);
		
		System.out.println();
		// convert arrays into ArrayList
		int[] intArr= {10,20,30};
		List<Integer> lst= new ArrayList<>();
		for(int i:intArr) {
			lst.add(i);
		}
		System.out.println("Arrays to ArrayList: ");
		System.out.println(lst);
		System.out.println("Size: "+lst.size());
		
		//set to Array
		Object[] objArr=ts.toArray();
		int[] intArr2=new int[objArr.length];
		for(int i=0;i<objArr.length;i++) {
			int num=(Integer)objArr[i];
			intArr2[i]=num;
		}
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter float value:");
//		String str=sc.next();
//		System.out.println(str);
//		float f= Float.parseFloat(str);
//		System.out.println(f);
//		
//		//type casting
//		int f1=(int)Float.parseFloat(str);
//		System.out.println(f1);
		
		
		
		Employee emp1 = new Employee(1001,"Ram");
		Employee emp2 = new Employee(1002,"Sam");
		Employee emp3 = new Employee(1002,"Sam");
		Employee emp4 = emp1;
		
		HashSet<Employee> hs2= new HashSet<>();
		hs2.add(emp1);
		hs2.add(emp2);
		hs2.add(emp3);
		hs2.add(emp4);
		
		System.out.println("size of HashSet: "+hs2.size()); //2
		System.out.println("HashSet: \n"+hs2);
		
		
		ArrayList<Employee> al=new ArrayList<>();
		al.add(emp1);
		al.add(emp2);
		al.add(emp3);
		al.add(emp4);
		System.out.println("size of ArrayList: "+al.size()); //4
		System.out.println("ArrayList: \n"+al);
		
		
		System.out.println(emp1.hashCode()); //113910
		System.out.println(emp2.hashCode()); //114902
		System.out.println(emp3.hashCode()); //114902
		System.out.println(emp4.hashCode()); //113910
		
	}

}
