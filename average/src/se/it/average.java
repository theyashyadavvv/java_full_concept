package se.it;
import java.util.*;
public class average {
	public static int CalculateAverage(int a, int b, int c) {
		int average = (a+b+c)/3;
		return  average;
		
	}
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the first number a");
		int a= sc.nextInt();
		System.out.println("enter the second number b");
		int b= sc.nextInt();
		System.out.println("enter the third number c");
		int c= sc.nextInt();
		int average =CalculateAverage(a,b,c);
		System.out.println("average of the three number is"+average);
		
		
	}

}
