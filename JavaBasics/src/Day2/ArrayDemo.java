package Day2;

public class ArrayDemo {
	
	public static void main(String[] args) {
		// One dimensional array
				// creating an array
				// Case 1
				String[] colors = {"red", "orange", "green"};
				
				System.out.println();
				// read
				System.out.println(colors[2]); // "green"
				System.out.println();
				
				// for
				for(int i=0;i<colors.length;i++) {
					System.out.println(colors[i]); // red, orange, green
				}
				
				System.out.println();
				// for-each
				for(String color:colors) {
					System.out.println(color);
				}
				
				// while
				int indx =0;
				while(indx<colors.length) {
					System.out.println(colors[indx]);//red, orange, green
					indx++;
				}
				
				// Case 2
				int[] numArr = new int[5];
				numArr[0]=10;
				numArr[1]=20;
				numArr[2]=30;
				numArr[3]=40;
				numArr[4]=50;
				
				System.out.println();
				for(int num:numArr) {
					System.out.print(num+" ");
				}
				
				System.out.println();
				// case 3:
				char[] charArr = new char[]{'h', 'e', 'l', 'l', 'o'};
				for(char ch:charArr) {
					System.out.print(ch+" ");
				}
				
				charArr[0]='H';
				
				System.out.println();
				for(int i=0;i<charArr.length;i++) {
					System.out.print(charArr[i]+" "); // 'H', 'e', 'l', 'l', 'o'
				}
				
				// multi dimensional array
				int[][] intArr = {{10,20,30}, {40,50,60}, {70,80,90}};
				//read
				System.out.println(intArr[0][2]); //30
				System.out.println(intArr[2][1]); //80
				for(int i=0;i<intArr.length;i++) { //no of rows
					// System.out.println(intArr[i]);//[I@7c30a502 [I@49e4cb85 [I@2133c8f8
					for(int j=0;j<intArr[i].length;j++) { // no of columns in each array
						System.out.println(intArr[i][j]); //10,20,30, 40,50,60, 70,80,90
					}
					System.out.println();
				}
				System.out.println();
				
				//update
				intArr[2][0]=700;
				System.out.println(intArr[2][0]); //700
				
				//case 2
				String[][] strArr = new String[3][3];
				strArr[0][0]="aa";
				strArr[0][1]="bb";
				strArr[0][2]="cc";
				
				strArr[1][0]="dd";
				strArr[1][1]="ee";
				strArr[1][2]="ff";
				
				strArr[2][0]="gg";
				strArr[2][1]="hh";
				strArr[2][2]="ii";
				
				System.out.println();
				for(String[] sArr:strArr) {
					for(String s:sArr) {
						System.out.println(s+" ");
					}
					System.out.println();
				}
				
				
				//Jagged Array
				int[][] jaggedArr = new int[4][];
				jaggedArr[0]=new int[1];
				jaggedArr[1]=new int[2];
				jaggedArr[2]=new int[3];
				jaggedArr[3]=new int[4];
				
				//insert values
				for(int i=0;i<jaggedArr.length;i++) { //no of rows
					for(int j=0;j<jaggedArr[i].length;j++) { // no of columns in each array
						jaggedArr[i][j]=1;
					}
					System.out.println();
				}
				
				//read
				System.out.println();
				for(int i=0;i<jaggedArr.length;i++) { //no of rows
					for(int j=0;j<jaggedArr[i].length;j++) { // no of columns in each array
						 System.out.println(jaggedArr[i][j]);
					}
					System.out.println();
				}
				
				
	}

}
