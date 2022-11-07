package Day6;
import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;
/*
 * Iterable(I)    //I-interface, C-class
 *  Collection(I)
 *    List(I)
 *      ArrayList(C)
 *        - insertion order to be maintained
 *             - duplicates allowed
 *             - null values are allowed
 *             - Heterogeneous elements are allowed
 *             - Based on Dynamic array
 *             - re-sizable
 *             - methods are not synchronized
 *             - not thread safe
 *             - can be accessed using index
 *             - initial capacity - 10
 *             - incremental capacity - (current capacity * 3/2)+1
 *             - frequent operation retrieval
 *             - able to access elements randomly
 *      LinkedList(C)
 *            - insertion order to be maintained
 *             - duplicates allowed
 *             - null values are allowed
 *             - Heterogeneous elements are allowed
 *             - Based on Doubly linked list (data structure)
 *             - re-sizable
 *             - methods are not synchronized
 *             - not thread safe
 *             - can be accessed using index
 *             - initial capacity-
 *             - incremental capacity
 *             - frequent operation insertion and deletion
 *      Vector(C) - 1.0v - legacy classes
 *             - Legacy class
 *               - methods are synchronized
 *               - thread safe
 *               - insertion order to be maintained
 *             	 - duplicates allowed
 *               - null values are allowed
 *               - Heterogeneous elements are allowed
 *               - re-sizable
 *               - peformance is slower compared to ArrayList
 *               - initial capacity 10
 *               - incremental capacity - current capacity * 2
 *          Stack(C) - 1.0v - legacy classes
 *               - LIFO
 *               - Sub class of Vector
 *               - pop() - removes last inserted element
 *               - peek() - it return last inserted element
 *               - push() - add elements
 *               - Thread safe
 *    SET(I)
 *      
 *    Queue(I)
 *   Map()
 *   
 *   Comparator/Comparable - sort
 */


public class ListDemo {
	public static void main(String[] args) {
		List al=new ArrayList();  // loose coupling
		// ArrayList al2=new ArrayList(); //tight coupling
		al.add(10);
		al.add(Integer.valueOf(50));
		al.add(20);
		al.add(30);
		al.add("Hello");
		al.add(false);
		al.add(10.23f);
		al.add(10.23f);
		al.add(null);
		System.out.println(al);
		//read element
		System.out.println(al.get(2));
		//length
		System.out.println("Size: "+al.size());
		
		//iterate
		System.out.println();
		for(int i=0;i<al.size();i++) {
			System.out.println("The "+(i+1)+" element is: "+al.get(i));
		}
		
		//using iterator()
		System.out.println();
		System.out.println("Iterator");
		Iterator it=al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		//ListIterator()
		System.out.println();
		System.out.println("ListIterator - Left to Right");
		ListIterator lt=al.listIterator();
		while(lt.hasNext()) {
			System.out.println(lt.next());
		}
		System.out.println("ListIterator - Right to Left");
		while(lt.hasPrevious()) {
			System.out.println(lt.previous());
		}
		
		//Generics
		List<Double> al3= new ArrayList();
		al3.add(10.23);
		//al3.add(11); not supported
		al3.add(20.54);
		
		List<String> al4=new ArrayList();
		al4.add("aa");
		al4.add("bb");
		al4.add("aa");
		al4.add("bb");
		al4.add(null);
		
		//iterate
		System.out.println();
		for(Double el:al3) {
			System.out.println(el);
		}
		
		System.out.println();
		for(String el:al4) {
			System.out.println(el);
		}
		
		List<Employee> al5=new ArrayList<>();
		Employee emp1=new Employee(1001,"Ram");
		Employee emp2=new Employee(1001,"Sam");
		al5.add(emp1);
		al5.add(emp2);
		al5.add(new Employee(1003,"Ravi"));
		al5.add(new Employee(1004,"Krish"));
		System.out.println(al5); //
		
		Iterator it2=al5.iterator();
		while(it2.hasNext()) {
			//convert Object to Employee
			Employee emp=(Employee)it2.next();
			System.out.println("EmpId= "+emp.empId +" | Name= " + emp.empName);
			
		}
		
		al.addAll(al4);  //add all elements of collections al4 to al
		System.out.println();
		System.out.println(al);
		
		al.removeAll(al4); //remove all elements of collection of al4 from al
		System.out.println();
		System.out.println(al);
		
		
		// List<String> ll = new LinkedList<>();
		// Vector<String> v = new Vector<>();
		// Stack<Integer> st= new Stack<>();
	}
	

}
