package Day7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import Day7.Employee;

public class ComparatorDemo {
	
	public static void main(String[] args) {
		
		Employee emp1=new Employee(1002,"Ram");
		Employee emp2=new Employee(1001,"Sam");
		Employee emp3=new Employee(1003,"Mani");
		
		List<Employee> empList=new ArrayList<>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		
		//sort by empId
		System.out.println(empList); 
		Comparator<Employee> comparebyId=new ComparatorByEmpId();
		
		Collections.sort(empList, comparebyId);
		
		System.out.println("After sort: "+empList);
		
		//sort by empName
		System.out.println(empList); 
		Comparator<Employee> compareByName=new ComparatorByEmpId();
		
		Collections.sort(empList, compareByName);
		
		System.out.println("After sort: "+empList);
		
	}

}
