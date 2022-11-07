package Day7;
import java.util.Comparator;

public class CompareByName implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		//sorting in asc order
		return o2.getEmpName().compareTo(o1.getEmpName());
		
		//sorting in desc order
		//return o1.getEmpName().compareTo(o2.getEmpName());
		
	}
	
	
	

}
