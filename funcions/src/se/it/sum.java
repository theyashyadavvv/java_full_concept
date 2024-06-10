package se.it;
import java.util.*;
public class sum {
	public static int PrintSum(int a, int b) {
		int sum = a+b;
		return sum;
	}
	public static void main(String args[]) {
		Scanner sc=  new Scanner(System.in);
		int x,y;
		x = sc.nextInt();
		y =  sc.nextInt();
		int endans=PrintSum(x,y);
		System.out.println("sum is"+endans);
	}

}


// methods bhi khate hai
