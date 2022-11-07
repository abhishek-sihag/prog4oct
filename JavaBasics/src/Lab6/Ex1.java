package Lab6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

public class Ex1 {
	
	public static void main(String[] args) {
		HashMap<Integer, String> hm=new HashMap<>();
		hm.put(1001, "Ram");
		hm.put(1002, "Sam");
		hm.put(1009, "Dan");
		hm.put(1005, "Chloe");
		hm.put(1004, "Ella");
		
		System.out.println(hm);//{1001=Ram, 1002=Sam, 1003=Dan, 1004=Ella, 1005=Chloe}
		
		//sorting by treemap
		TreeMap<Integer, String> tm= new TreeMap<>(hm);
		Iterator itr=tm.keySet().iterator();
		while(itr.hasNext()) {
			int i=(int)itr.next();
			System.out.println(i+" "+hm.get(i));
		}
	}

}
