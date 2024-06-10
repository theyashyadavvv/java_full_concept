package time_complexity_sum_of_first_natural_number;
import java.util.*;
public class complexty {
	public static void main(String args[]) {
		double now = System.currentTimeMillis(); 
		Scanner sc= new Scanner (System.in);
		System.out.println("enter the the sum off number");
	 int n= sc.nextInt();
		System.out.println("time taken -" +(System.currentTimeMillis()-now) + "millisecs.");
	}
public int findsum(int n) {
	return n * (n+1)/2;
}
}
