package abstarct_method_class_oops;
//abstract class phone{
//	 abstract void on() ;
//	 abstract void off();
//}
//class smartphone extends phone{
//	void on() {
//		System.out.println("phone on....");
//	}
//	void off() {
//		System.out.println("phone off....");
//	}
//	
//}
//class mega extends smartphone{
//	void off() {
//		System.out.println("phone of....");
//	}
//}
//
//public class concept {
//	public static void main(String args[]) {
//		smartphone sol=new mega ();
//		sol.off();
//		sol.on(); 
////		sol.area(5);
////		System.out.println("area:" +sol.area(5));
//		
//	}
//
//}

// abstract ka use hota hai multiple class banane ke liya jisko ham bana toh sakte hai but use nhi kr sakte for example
//ager hamre parent class ko abstract karte hai toh uske ander ka koi code use nhi kr sakte but ager ham chaye toh uske method extends kr ke dusre class meuse kr sate hai
 
// abstract class paretnt{
//	public void onn() {
//		System.out.println("phone is on...");
//	}
//abstract void greet();
//}
//class child extends  paretnt{
//	
//	public void greet () {
//		System.out.println("phone is off...");
//		
//	}
//	class child_2 extends paretnt{
//		public void greet() {
//	}
//		public void off() {
//			System.out.println("phone is off...");
//		}
//			
//		}
//	
//}
//public class  concept{
//	public static void main(String args[]) {
//		child_2 c=new child_2();
//		c.off(); 
//	}
//}

abstract class parent{
    abstract void car(String name);
    abstract void model(int price);
}
class child extends parent{
    void car(String name){
        System.out.println("car name " +name+ " ");
      
    }
    void model(int price){
        System.out.println("car price " +price);
    }
    
    
}
class doughter extends parent{
    void car(String name){
        System.out.println("she have " +name);
        
    }
    void model(int price){
        System.out.println("price " +price );
    }
}
public class concept{
    public static void main(String args[]){
//    	this is a normal object
       child so = new child();
        so.car("honda");
//        this is a dynamic dispatch
        parent so1= new  doughter(); //---allowed
        so1.model(8888);
        parent so2 = new child(); //---allowed
        	so2.model(9000000);	
    }
}
// abstract ka use hota hai ki parent clas me without body ke functions banan or usko child class ko dena
// we can also use properties in abstract class like int age; / we can also use counstructor but hamko use jise class ke liya extdends krte hai waha super ka use krna hoga uske counstructor me
// we can also use static and normal function in abstract clas
