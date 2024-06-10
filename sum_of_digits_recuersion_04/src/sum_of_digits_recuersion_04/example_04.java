package sum_of_digits_recuersion_04;

public class example_04 {
	public static void main (String args[]) {
		int ans = digits (1342);
		System.out.println(ans);
		
	}
	static int digits(int n) {
		if (n==0) {
			return 0 ;		}
		return (n%10) + digits (n/10);
	}

}
