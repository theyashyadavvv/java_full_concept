package twoD_array;
import java.util.*;
public class twoDarray {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		int size=sc.nextInt();
		int row=sc.nextInt();
		int coloum=sc.nextInt();
		
		int number[][]=new int[row][coloum];
//		
////		input
//		outerloop
		for(int i=0;i<row;i++) {
			for(int j =0;j<coloum;j++) {
				number[i][j]= sc.nextInt();
			}
			
		} 
////		output
		for (int i=0;i<row;i++) {
			for(int j=0;j<coloum;j++) {
				System.out.print(number[i][j] +" ");
				
			}
			System.out.println();
		}
//		for one dimention array 
//		int marks[]; // a 1-D array;
//		 int [][]flats; //A 2D-array;
//		int flat [][]=new int[3][4];
//		flat[0][0]=102;
//		flat[0][1]=103;
//		flat[0][2]=104;
//		flat[0][3]=105;
//		flat[1][0]=106;
//		flat[1][1]=107;
//		flat[1][2]=108;
//		flat[1][3]=109;
//		flat[2][0]=110;
//		flat[2][1]=111;
//		flat[2][2]=112;
//		flat[2][3]=113;
//		System.out.println("printing a 2D array using for loop");
//		for(int i =0; i<flat.length; i++) {
//		for (int j=0;j<flat[i].length;j++) {
//			System.out.print(flat[i][j]);
//			System.out.print(" ");
//			
//		}
//		System.out.println(" ");
//			
//		}
//		
////		
//		
	}

}
