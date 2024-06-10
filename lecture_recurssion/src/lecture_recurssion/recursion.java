package lecture_recurssion;

public class recursion {
 static int factorual(int n) {
	 /*factorial (0)=1;
	  * factorial = n*(n-1)*n-2*...1
	  * factorial 4 = 4*3*2*1=24;
	  * formula for factorial
	  * factorial(n)= n*factorial(n-1)
	  * 
	  * 
	  */
	 if(n==0|| n==1) {
		 return 1;
		 
	 }
	 else {
		 return n*factorual(n-1);
	 }
	 public static void main(String args[]) {
		int n= 5;
		System.out.print("factorial of the number is" +factorual(n));
	 }
 
 }
 }
