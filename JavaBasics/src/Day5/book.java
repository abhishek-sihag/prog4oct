package Day5;

import java.util.Iterator;
import java.util.TreeSet;

public class book {
	private String title;
	private double price;
	public book(String title, double price)
	{
		this.title=title;
		this.price=price;
	}
	public String getTitle() {
		return (title);
	}
	public double getPrice() {
		return(price);
	}

	public static void main(String[] args) {
		book b1,b2,b3;
		b1= new book("PHP",300.00);
		b2= new book("Java",500.00);
		b3= new book("C-p",400.00);
		
		TreeSet t=new TreeSet(new MyComparator());
		t.add(b1);
		t.add(b2);
		t.add(b3);
		
		book b;
		Iterator it=t.iterator();
		while(it.hasNext()) {
			b=(book) it.next();
			System.out.println(b.getTitle()+" "+b.getPrice());
			
		}
	}
	
}


