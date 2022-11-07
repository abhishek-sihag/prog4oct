package Day5;

import java.util.Comparator;

public class MyComparator implements Comparator {

	public int compare(Object o1, Object o2) {
		book book1=(book)o1;
		book book2=(book)o2;
		if(book1.getPrice() < book2.getPrice())
		return (-1);
		else
			return(1);
	}

}
