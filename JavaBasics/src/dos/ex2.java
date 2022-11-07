package dos;

import java.util.ArrayList;
import java.util.HashMap;

class Mobile{
	HashMap<String, ArrayList<String>> mobiles = new HashMap<>();

	public String addMobile(String company, String model){
		if(mobiles.containsKey(company)){
			ArrayList<String> al=mobiles.get(company);
			al.add(model);
			mobiles.put(company, al);
		} else {
			ArrayList<String> al= new ArrayList<>();
			al.add(model);
			mobiles.put(company, al);
		}
		return "model successfully added";
	}
	public ArrayList<String> getModels(String company){
		if(mobiles.containsKey(company)){
			return mobiles.get(company);
		}else{
			return null;
		}
	}
	public String buyMobile(String company, String model){
		if(mobiles.containsKey(company)){
			ArrayList<String> al=mobiles.get(company);
			for(String mod: al){
				if(mod.equals(model)){
					al.remove(model);
					mobiles.put(company, al);
					return "mobile sold successfully";
				}
			}
		}
		return "item not available";
	}
    // Write your code here..
}
public class ex2 {

}
