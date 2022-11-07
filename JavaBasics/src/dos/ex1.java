package dos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class ArrayListOps {
	public ArrayList<Integer> makeArrayListInt(int n){
		ArrayList<Integer> list= new ArrayList<>();
		for(int i=0;i<n;i++){
			list.add(0);
		}
		return list;

	}
	public ArrayList<Integer> reverseList(ArrayList<Integer> list){
		//ArrayList<Integer> list = new ArrayList<>();
		Collections.reverse(list);
		return list;
	}
	public ArrayList<Integer> changeList(ArrayList<Integer> list, int m, int n){
		int ind=-2;
		while(true){
			ind= list.indexOf(Integer.valueOf(m));
			if(ind!=-1){
				list.remove(ind);
				list.add(ind, n);
			}else{
				break;
			}
		}
		return list;
	}
   
}

public class ex1 {

}
