package se.it;
import java.util.*;
public class greatter {
	public static void ShowGreater(int a,int b) {
		if(a>b) {
			System.out.println("a is greater");
			
		}
		else if(b>a) {
			System.out.println("b is greater");
		}
		else {
			System.out.println(" a and b isequal");
		}
		}
		
	public static void main(String args[]) {
		Scanner sc= new Scanner (System.in);
		System.out.println("enetr the a");
		int a=sc.nextInt();
		System.out.println("enetr the b");
		int b= sc.nextInt();
		ShowGreater( a, b);
	}

}
