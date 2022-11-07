package Day5;
import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[]  args) {
		HashSet<Integer> value=new HashSet<>();
		value.add(12);
		value.add(22);
		value.add(12);
		value.add(45);
		
		System.out.println(value);
	}

}
