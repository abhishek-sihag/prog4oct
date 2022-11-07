package Lab6;

import java.util.HashMap;
import java.util.Map;

public class EX4 {
	
	public static void main(String[] args) {
		
		HashMap<String, Integer> hm1= new HashMap<>();
		hm1.put("Raaj", 90);
		hm1.put("Yuvraj", 79);
		hm1.put("Rajlakshami", 100);
		hm1.put("Renuka", 81);
		hm1.put("Nandan", 89);
		hm1.put("Ram", 70);
		hm1.put("Sam", 91);
		
		System.out.println("Medals are as follows: ");
		System.out.println(getStudents(hm1));
	}
	
	public static HashMap getStudents(HashMap<String, Integer> hm1) {
		HashMap<String, String> hm= new HashMap<>();
		for(Map.Entry e: hm1.entrySet()) {
			int marks = (int)e.getValue();
			if(marks>=90 && marks<=100) {
				hm.put((String)e.getKey(), "GOLD");
			}else if(marks>=80 && marks<90) {
				hm.put((String)e.getKey(), "SILVER");
			}else {
				if(marks>=70 && marks<80) {
					hm.put((String)e.getKey(), "BRONZE");
				}
			}
		}
		return hm;
	}
	

}
