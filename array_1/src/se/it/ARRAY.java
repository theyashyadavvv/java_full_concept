package se.it;
import java.util.*;
public class ARRAY {
public static void main(String args[]) {
//	int[]marks=new int[3];
//	or
//	int marks[]=new int[3];
//	
//	marks [0]=97;
//	marks[1]=98;
//	marks[2]=99;
//for(int i=0;i<3;i++) {
//	System.out.println(marks[i]);
//}
	
	
	
	
	
	
////array size from user
//Scanner sc=new Scanner(System.in);
//System.out.println("enter the size of array");
//int size=sc.nextInt();
//int number[]= new int[size];
//for(int i=0;i<size;i++) {
//	System.out.println(number[i]);
//}


//Scanner sc = new Scanner (System.in);
//
//int size = sc.nextInt();
//int number[]=new int[size];
////input
//for(int i=0; i<size;i++) {
//  number[i]= sc.nextInt();
//}
////output
//for(int i=0;i<number.length;i++) {
//System.out.println(number[i]);	
//}
	Scanner sc =new Scanner(	System.in);
	System.out.println("enter the size of array");
	int size= sc.nextInt()
;
	int number[]=new int[size];
	for(int i =0;i<size;i++) {
		
		number[i]=sc.nextInt();
	}
	System.out.println("enter the value x ");
	int x= sc.nextInt();
	
	
	for(int i= 0;i<size;i++) {
		if(number[i]==x) {
			System.out.println("x found at the index"+i);
		}
		
		
	}
		
			
	

}
}
