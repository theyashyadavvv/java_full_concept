package method_overloding_in_function;
import java.util.*;
public class overloding {
//	static int change(int a) {
//		a=98;
//	return 0;}
	/*function for changing  the array*/
//	static int change2(int []array) {
//		array[0]=98;
		
		
//		return 0;
//	}
	
//	public static void main(String args[]) {   /* iske ander hamne ya batya hai ke jo a =98 hai wo bass ek copay hai x ke call krne pr wahi value ayegi jo hamne main class me le hai    */
		
		/*case 1 changing tha integer*/
//		int x =57;
//		change(x);
		
//		System.out.println(x);
		
		/*case 2 change the array*/
//		int marks[]= {57,87,78,98,89};
//		change2(marks);
//		System.out.println(marks[0]);
	
	
	
	
//		
 /* METHOD OVERLODING */                /*overloding ke liya diff parameterse lene hote hai jise ke foo() bracket ke ander jo hota hai wo parameters hota hai */
	static void foo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:");
		int n=sc.nextInt();
		System.out.println(n);
	}
	static void foo(int a) {
		System.out.println("hello bro good " +a+ "morning");
	}
	public static void main(String args[]) {
		foo();
		foo(89);
	}


}
