package Lab1;
import java.util.*;

public class LabEx1{
	
//	public static void main(String[] args) {
//		int a[]= {10,20,9,60,2,5,90};
//		System.out.println("Second smallest one is: "+getSecSmall(a,7));
//	}
//	
//	public static int getSecSmall(int[] a, int t) {
//		int temp;
//		for(int i=0;i<t;i++) {
//			for(int j=i+1;j<t;j++) {
//				if(a[i]>a[j]) {
//					temp = a[i];
//					a[i]=a[j];
//					a[j]=temp;
//				}
//			}
//		}
//		return a[1];
//	}
	
	public static void main(String[] args) {
		Scanner no = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = no.nextInt();
		
		System.out.println("Enter elements: ");
		int[] arr= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=no.nextInt();
			
		}
		
		LabEx1 p=new LabEx1();
		System.out.println("The second smallest element is: "+p.getSecondSmallest(arr));
	}
	
	int getSecondSmallest(int[] arr) {
		Arrays.sort(arr);
		return arr[1];
	}
	

}