package Day5;

import java.util.HashMap;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put(null, null);
		hm.put(1, "Amit");
		hm.put(2, "Rohan");
		hm.put(null, null);
		hm.put(3, "Samar");
		
		System.out.println(hm);
	}

}
