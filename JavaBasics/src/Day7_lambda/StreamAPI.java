package Day7_lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {
	
	public static void main(String[] args) {
		List<Integer> al= new ArrayList<>();
		al.add(5);
		al.add(10);
		al.add(15);
		al.add(20);
		al.add(25);
		al.add(15);
		al.add(35);
		al.add(40);
		al.add(25);
		
		//return values greater than 15
		List<Integer> result =al.stream().filter(num->num>15).collect(Collectors.toList());
		System.out.println(result);
		
		//return number of elements present in arraylist
		System.out.println(al.stream().count());
		
		//return values less than 20
		List<Integer> result1 =al.stream().filter(num->num<20).collect(Collectors.toList());
		System.out.println(result1);
		
		//find number of elements whose value is less than 20
		long count = al.stream().filter(num->num<20).count();
		System.out.println(count);
		
		//find distinct elements
		System.out.println("before distinct: "+al);
		List<Integer> res =al.stream().distinct().collect(Collectors.toList());
		System.out.println("After distinct: "+res);
		
		
		//map
		List<Integer> sq=al.stream().map(num->num*num).collect(Collectors.toList());
		System.out.println("Square: "+sq);
		
		//sort
		System.out.println("By default sort in asc order: ");
		List<Integer> sortedEl =al.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted elements are: "+sortedEl);
		
		System.out.println("desc order: ");
		List<Integer> sortedEl2 =al.stream().sorted((x,y)->x>y?-1:1).collect(Collectors.toList());
		System.out.println("Sorted elements are: "+sortedEl2);
		
		//print all elements
		System.out.println("print all elements: ");
		al.stream().forEach(num->System.out.println(num));
		
		//return odd numbers
		List<Integer> oddVal=al.stream().filter(num->num%2!=0).collect(Collectors.toList());
		System.out.println("odd are: "+oddVal);
		
		//All match, noneMatch, anyMatch, min, max
		List<Integer> al2=new ArrayList<>();
		al2.add(2);
		al2.add(4);
		al2.add(6);
		al2.add(8);
		
		System.out.println("All match: "+al2.stream().allMatch(num->num%2==0)); //true
		
		
		System.out.println("None match: "+al2.stream().noneMatch(num->num%3==0)); //false
		
		System.out.println("Any match: "+al2.stream().anyMatch(num->num%3==0));
		
		System.out.println("Max: "+al2.stream().max(Comparator.comparing(Integer :: valueOf)).get()); //8
		Integer maxValue = al2.stream().max((x,y)->x>y?1:-1).get();
		System.out.println("Sudheer's method max:"+maxValue);
		
		
		System.out.println("Min: "+al2.stream().min(Comparator.comparing(Integer :: valueOf)).get()); //2
		Integer minValue = al2.stream().min((x,y)->x>y?1:-1).get();
		System.out.println("Sudheer's method min:"+minValue);
		
		
		List<String> al5=new ArrayList<>();
		al5.add("CC");
		al5.add("aa");
		al5.add("dd");
		al5.add("cc");
		
		//min & max
		Stream<String> strStream=al5.stream();
		String minString = strStream.min((str1,str2)->str1.compareTo(str2)).get();
		System.out.println("string min: "+minString);
		
		Stream<String> strStream1=al5.stream();
		String maxString = strStream1.max((str1,str2)->str1.compareTo(str2)).get();
		System.out.println("string max: "+maxString);
		
		
		
	}
	
	
//	List<Integer> m1(List<Integer> al){
//		List<Integer> newAl= new ArrayList<>();
//		for(Integer i:al) {
//			if(i>15) {
//				newAl.add(i);
//			}
//		}
//		return newAl;
//	}
	

}
