package Day7;
import java.util.Comparator;

public class ComparatorByEmpId implements Comparator<Employee>{
	
	@Override
	public int compare(Employee o1, Employee o2) {
		//sorting in desc order
		return o1.getEmpId()>o2.getEmpId()?-1:o1.getEmpId()<o2.getEmpId()?1:0;
		//sorting in asc order
		//return o1.getEmpId()>o2.getEmpId()?1:o1.getEmpId()<o2.getEmpId()?-s1:0;
	}

}
