package factorual_using_ecuersion_example3;

public class example {
	public static void main(String args[]) {
//		int ans = factorial(5);
//		System.out.println(ans);
//	}
//	static int  factorial(int n) {
//		if(n==1) {
//			return 1;
//		}
//		return n * factorial(n-1);
		
		
//		FOR SUM OR NUMBER
		
 int ans = sum(5);
 System.out.println(ans);
	}
	static int sum(int n) {
		if(n<=1) {
			return 1;
		}
		return n + sum(n-1);
	}
	
	
}
