package Lab1;

//import java.util.Scanner;

public class Ex1 {
	
	public static void main(String[] args) {
		
		
		Ex1 a=new Ex1();
		System.out.println(a.sumofcubeofdigitofno(12));
		
	}
	int sumofcubeofdigitofno(int n) {
		int sum=0;
		while(n!=0) {
			int i=n%10;
			n=n/10;
			sum=sum+(i*i*i);
		}
		return sum;
	}

}
