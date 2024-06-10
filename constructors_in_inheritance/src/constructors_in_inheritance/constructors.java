package constructors_in_inheritance;
class base1{
	
	
	base1(){
		System.out.println("i am counstructor");
	}
	base1(int x){
		System.out.println("overloded base1 counstructor with valuse of x:" +x);
	}
}
class base_2 extends base1{
	
	base_2(){
		System.out.println("i am a base_2 class cunstrortuctor ");
	}
	base_2(int x,int y){
		super(x);
		System.out.println("overloded base2 counstructor with valuse of y:" +y);
	}
	
	
	
	
}
class base3 extends base_2{
	base3(){
		System.out.println("i am a base3 counstructor");
	}
	base3(int x,int y,int z){
		super(x,y);
		System.out.println("overloded base2 counstructor with valuse of z:" +z);
	}
}
public class constructors {
	public static void main (String arg[]) {
////		base1 b= new base1();
//		base_2 b2=new base_2(2,3);
		base3 b3=new base3(5,6,8);
	}
}
