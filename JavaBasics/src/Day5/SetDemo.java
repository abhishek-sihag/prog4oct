package Day5;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
	public static void main(String[] args) {
		Set<Integer> values=new HashSet<>();
		
		//heap memory
		values.add(7);
		values.add(5);
		values.add(4);
		values.add(5);
		System.out.println(values.add(9));
		System.out.println(values.add(5));
		System.out.println(values.add(97));
		System.out.println(values.add(92));
		
		for(int i: values) {
			System.out.println(i);
		}
	}

}
