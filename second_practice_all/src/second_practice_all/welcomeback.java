package second_practice_all;
import java.util.*;
public class welcomeback {
//	public static void main(String args[]) {
//		Scanner h = new  Scanner(System.in);
////		System.out.println("enter tha firts number:");
////		int a= h.nextInt();
////		System.out.println("enter the second number:");
////		int b= h.nextInt();
////		int c= a+b;
////		System.out.println("addtion of two number is :"+c);
////		if(c%2==0) {
////			System.out.println("the number is divisble by 2");
////			
////		}
////		else {
////			System.out.println("number is not divisible by 2");
////		}
//		
////		
////	
////		Scanner sc = new Scanner(System.in);
////		System.out.println("enter the number for print the table of that number");
////	int n= sc.nextInt();
////	for (int i=1;i<=10;i++) {
////		
////		int table = n*i;
////		System.out.println(table);	
////		
////	}
////	n=10;
////	for(int j = 9; j>=n ; --j) {
////		int table = n*j;
////		System.out.println(table);
////	}
//		
//		
//
//}
//	public static int  printsum(int a, int b) {
//		int c= a + b;
//	return c;	
//	}
//	public static void main (String args[]) {
//		Scanner sc= new Scanner (System.in);
//		System.out.println("enrter the first number :");
//		int x= sc.nextInt();
//		System.out.println("enter the second number:");
//		int y= sc.nextInt();
//		int addtion=printsum(x,y);
//		System.out.println("addtion of two number is"+addtion);
//		}
	public static void main(String args[]) {
//		int marks[]= new int [3];
//		marks[0]= 1;
//		marks[1]=2;
//		marks[2]=3;
//		for(int i=0; i<3;i++) {
//			System.out.println(marks[i]);
			
//		}
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size of array:");
		int size= sc.nextInt();
		int number[]=new int[size];
		for(int i =0 ; i<number.length; i++) {
			System.out.println("enter the number:");
		number[i]= sc.nextInt();
			
		}
	}
}
