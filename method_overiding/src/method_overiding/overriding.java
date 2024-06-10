package method_overiding;
class A{
	public int a;
	public int method1() {
		return 4;
		
	}
	public void method2() {
		System.out.println("i am method 2 of class A");
	}
}
class B extends A{

//	iske ander class A ka method 2 same hai or ya run ho rha hai because isne A kr methpod and property o access kia hai ise hi method overeeiding khte hai
	public void method2() {
		System.out.println("i am method 2 of class B");
		
	}
	public void method3() {
		System.out.println("i am method 3 of class B");
		
	}
}

public class overriding {
	public static void main(String args[]) {
		A a= new A();
		a.method2();
		B b=new B();
		b.method2();
	}

}
