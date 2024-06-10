package print_N_to_1_using_recuerssion;

public class example {
//	public static void Nto1(int n) {
//		if(n==0) {
//			return;
//		}
//		Nto1(n-1);
//		System.out.println(n);
//	}
//	public static void main(String args[]) {
//		Nto1(5);
//		
//		
//	}N

	
	
	
	
//	print 1 to 5
	
	public static void oneton(int n) {
		if(n==0) {
			return;
		}
		
		oneton(n-1);
		System.out.println(n);
	}
	public static void main (String args[]) {
		oneton(5);
		
	}
}
