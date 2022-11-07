package Lab3;

import java.time.LocalDate;
import java.time.*;
import java.util.*;

public class Ex9 {
	public static void main(String[] args) {
		
		
		System.out.println("Enter date with YYYY/MM/DD: ");
		Scanner scan= new Scanner(System.in);
		int year=scan.nextInt();
		int month=scan.nextInt();
		int date=scan.nextInt();
		LocalDate givenDate=LocalDate.of(year, month, date);
		LocalDate presentDate = LocalDate.now();
		Period difference=Period.between(givenDate, presentDate);
		System.out.println("Difference is "+difference.getYears()+" Years ");
		System.out.println(difference.getMonths()+" Months ");
		System.out.println(difference.getDays()+" Days");
	}

}
