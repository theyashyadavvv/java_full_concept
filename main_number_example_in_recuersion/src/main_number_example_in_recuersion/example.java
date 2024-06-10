package main_number_example_in_recuersion;

public class example {
//	print the number 1 to 10 using 1 function with the recursion
	public static void print(int n) {
		if(n==10) {
			System.out.println(10);
			return;
		}
		System.out.println(n);
//		 Recursion call
// if u are calling a function again and again., u can treat it is  as separate call in the stack  
		print(1+n);
		
	}
	
	public static void main(String args[]) {
		print(1);
		
	}

}
