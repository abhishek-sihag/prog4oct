package Day7_lambda;

import java.util.Arrays;
import java.util.List;

public class StreamDemo2 {
	public static void main(String[] args) {
	List<Integer> nums= Arrays.asList(6,5,2,8,1,7);
	//Stream<Integer> data = nums.stream();
//	Stream<Integer> sortedData= data.sorted(); 
//	sortedData.forEach(n->System.out.println(n));
	
	for(int n: nums) {
		System.out.println(n*2);
	}
	
	System.out.println();
//	long count= data.count();
//	System.out.println(count);
	
	System.out.println("Mapped data: ");
//	Stream<Integer> mappedData=data.map(n->n*2);
//	mappedData.forEach(n->System.out.println(n));
	
	//or
	System.out.println("using directly: ");
	nums.stream()
	.sorted()
	.map(n->n*2)
	.forEach(n->System.out.println(n));
	
	//for only odd numbers
	System.out.println("for odd ones :");
	nums.stream()
	.filter(n-> n%2==1)
	.sorted()
	.map(n->n*2)
	.forEach(n->System.out.println(n));
	
	//to add the values
	System.out.println("for add values :");
	int res=nums.parallelStream()
	.filter(n-> n%2==1)
	.sorted()
	.map(n->n*2)
	.reduce(0, (c,e)->c+e);
	System.out.println(res);
	
	}
}
