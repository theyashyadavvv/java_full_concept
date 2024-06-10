package se.it;
import java.util.*;
public class factoral {
	
	public static void CalculateFactorial(int n) {
		int factorial= 1;
		for(int i=n; i>=1;i--) {
				factorial= factorial*1;
			System.out.print(factorial);
			
			
			
		}
		return;
		
	}
	public 	static void main(String args[]) {
		Scanner sc=  new Scanner (System.in);
		int n= sc.nextInt();
		CalculateFactorial(n);
		
	}

}
