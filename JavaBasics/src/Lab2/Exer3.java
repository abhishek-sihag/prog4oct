package Lab2;


import java.util.Arrays;
import java.util.Scanner;

public class Exer3 {
	public static void main(String[] args) {
		int n, i;
		Exer3 three = new Exer3();
		System.out.println("How many elements in the array?");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println("Enter the elements:");
		int[] arr = new int[n];
		for(i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Output:");
		three.getSorted(arr);
		for(i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		sc.close();
		
	}
	
	public int[] getSorted(int arr[]) {
		int reverse;
		for(int i = 0; i < arr.length; i++) {
			reverse = 0;
			while(arr[i] != 0) {
				int digit = arr[i] % 10;
				reverse = (reverse * 10) + digit;
				arr[i] /= 10;
			}
			arr[i] = reverse;
		}
		Arrays.sort(arr);
		return arr;
	}
	
//	static int removeDuplicates(int arr[], int n)
//    {
//        
//        if (n == 0 || n == 1) {
//            return n;
//        }
// 
//        int[] temp = new int[n];
// 
//        
//        int j = 0;
//        for (int i = 0; i < n - 1; i++)
//            
//            if (arr[i] != arr[i + 1])
//                temp[j++] = arr[i];
// 
//        temp[j++] = arr[n - 1];
// 
//        for (int i = 0; i < j; i++)
//            arr[i] = temp[i];
// 
//        return j;
//    }
// 
//    public static void main(String[] args)
//    {
//    	Scanner sc=new Scanner(System.in);
//		System.out.println("Enter size of array: ");
//		int n=sc.nextInt();
//		System.out.println("Enter array: ");
//		int[] arr=new int[n];
//		for(int i=0;i<n;i++) {
//			arr[i]=sc.nextInt();	
//		} 
//    	Arrays.sort(arr);
////		Arrays.sort(arr, Collections.reverseOrder());
//// 
////		Arrays.toString(arr)
//        n = removeDuplicates(arr, n);
// 
//        for (int i = 0; i < n; i++)
//            System.out.print(arr[i] + " ");
//        sc.close();
//    }
}