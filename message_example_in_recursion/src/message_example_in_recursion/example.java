package message_example_in_recursion;
 
public class example {
	public static void message() {
		System.out.println("hello world");
		message1();
		
	}
	public static void message1() {
		System.out.println("hello world");
		message2();
	}
	public static void message2() {
		System.out.println("hello world");
		message3();
	}
	public static void message3() {
		System.out.println("hello world");
	}

	public static void main(String args[]) {
		
		message();
//		if ya message function ka use kr ke hame 5 baar hello world print krna hai ek hi function ka use kr ke to ham ek function ke ander dusre function ko call karenge
		
	}
}
