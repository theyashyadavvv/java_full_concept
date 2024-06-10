package se.it;

public class ifelse {
public static void main(String args[]) {
//	int age =6;
//	if(age>18) {
//		System.out.println("drive");
//	}
//	else {
//		System.out.println("not drive");
//		
//	}
//	 && ya  logical end ya tabhi true return krta hai jab dono bollean true return karenge
	System.out.println("for logical && operator");
	boolean a = true;
	boolean b = false;
	if (a && b) {
		System.out.println("yes");
		
	}
	else {
		System.out.println("no");
	}
	
	System.out.println("for logical oR operator");
//	isme dono me se ek bhi true hoga toh true ayega
	if (a  || b) {
		System.out.println("yes");
		
	}
	else {
		System.out.println("no");
	}
	
	System.out.println("for logical NOT operator");
	
	if (a != b) {
		System.out.println("yes");
		
	}
	else {
		System.out.println("no");
	}
	
	
}
}
