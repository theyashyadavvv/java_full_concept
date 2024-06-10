package dhynamic_method_dispatch;
class phone{
	public void showTime() {
		System.out.println("time is 8 pm..⏲️⏲️⌚⌚");
	}
	public void on() {
		System.out.println("phone is truning on...");
	}
	
}
class smartPhone extends phone {
	public void music() {
		System.out.println("playing music in smart phone 🎵🎵🎵🎵🎼🎼🎼🎼🎶🎶🎶....");
	}
	public void on() {
		System.out.println("smartphone is truning on...");
	}
	
}
public class dynamic {
	public static void main(String args[]) {
		/*	phone obj=new phone();  //it is allowed
		obj.greet();
//		obj.on();
	
	
smartPhone obj2=new smartPhone();//it is allowed
obj2.namaste();
obj2.on();
		*/
		//now dynamic method distpatch******
//		iske ander refrence hai phone ka or object hai smart phone ka 
		phone obj=new smartPhone();
		obj.showTime();
		obj.on();
		
//*******		joo method super class me nhi hai but sub class me hai toh wo run nhi hoga ****************
	//	obj.music();//this is not acessable
		
		
	}
}
