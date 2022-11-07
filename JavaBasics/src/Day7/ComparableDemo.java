package Day7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {
	
	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<>();
		ArrayList<Integer> al2=new ArrayList<>();
		al.add("aa");
		al.add("cc");
		al.add("bb");
		al.add("xx");
		
		
		System.out.println(al); //[aa, cc, bb, xx]
		
		Collections.sort(al);
		
		System.out.println("After sort: "+al); //[aa, bb, cc, xx]
		
		
		al2.add(100);
		al2.add(300);
		al2.add(500);
		al2.add(200);
		
        System.out.println(al2); //[100, 300, 500, 200]
		//sort in asc order
		Collections.sort(al2);
		
		System.out.println("After sort: "+al2);//[100, 200, 300, 500]
		
		
		
		Employee emp1=new Employee(1002,"Ram");
		Employee emp2=new Employee(1001,"Sam");
		Employee emp3=new Employee(1003,"Mani");
		
		List<Employee> empList=new ArrayList<>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		
		System.out.println(empList); 

		Collections.sort(empList);
		
		System.out.println("After sort: "+empList);
		
		
		
		
		
		
	}

}
