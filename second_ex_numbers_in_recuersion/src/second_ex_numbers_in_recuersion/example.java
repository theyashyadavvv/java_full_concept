package second_ex_numbers_in_recuersion;
// write a function that take in a  number and print number
//print first 5 numbers:1 2 3 4 5 
public class example {
	public static void number(int n) {
		System.out.println(n);
		number2(2);
	}
	public static void number2(int n) {
		System.out.println(n);
		number3(3);
		
	}
	public static void number3(int n) {
		System.out.println(n);
		
	number4(4);	
	}
	public static void number4(int n) {
		System.out.println(n);
		
		number5(5);
	}
	public static void number5(int n) {
		System.out.println(n);
		
		
	}
	
	public static void main(String args[]) {
//		print first 5 numbers:1 2 3 4 5  using single function
		number(1);
		
	}

}
