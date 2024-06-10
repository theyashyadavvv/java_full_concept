package fibonacci_in_recuresion;

public class example {
	public static void main(String args[]) {
	int ans = fibo(8);
	System.out.println(ans);
	}
	public static int fibo(int n) {
//		base condtions
		if(n<2) {
			return n;
		}
		return fibo(n-1)+fibo(n-2);
		
	}

}
