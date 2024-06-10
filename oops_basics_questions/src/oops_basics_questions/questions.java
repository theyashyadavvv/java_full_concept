package oops_basics_questions;


/* PROBLEM 1;
 * class employe{
 
	int salary;
String name;
	



public int getsalary() {
	return salary;
	
}
public String getname() {
	return name;
}
public void setName(String n) {
name=n;
}
}
public class questions {
	public static void main(String args[]) {
		employe yash= new employe();
//		yash.setName("yash");
		yash.setName("yash");
		System.out.println(yash.getname());
		
		yash.salary=444;
		yash.getsalary();
		System.out.println(yash.getsalary());
		System.out.println(yash.getname());
		
	}

}
*/

//  problem-2

/*class cellphone{
	public  void ring() {
	System.out.println("cell is ringing");
	}
	public void calling() {
		System.out.println("calling");
	}
}
public class questions {
	public static void main(String args[]) {
		cellphone oppo=new cellphone();
		oppo.ring();
		oppo.calling();
		
		
	}
}
*/

// problem 3
/*class squre{
	int side;
	public int area() {
	return side*side;
	}
	public int parameter() {
		return 4*side;
	}
}
public class questions{
public static void main(String args[]) {
	squre sq= new squre();
	sq.side =3;
	System.out.println(sq.area());
	System.out.println(sq.parameter());
	
}
}
*/
//problem 4
/*
class rectangle{
	int w;
	int h;
	public int area() {
		return w*h;
	}
	public int parameter() {
		return 2*(w+h);
	}
}
public class questions{
	public static void main(String args[]) {
		rectangle rq=new rectangle();
		rq.w=6;
		rq.h=8;
		System.out.println(rq.area());
		System.out.println(rq.parameter());
		
	}
}


*/
// probblem 5
/*
class tommy_Vecetti{
	public void hit() {
		System.out.println("Htting the enemey");
		
	}
	public void run() {
		System.out.println("running for the enemy");
		
	}
	public void fire() {
		System.out.println("firing on enemy");
		
	}
}
public class questions{
	public static void main(String args[]) {
		tommy_Vecetti player=new tommy_Vecetti();
		player.hit();
		player.run();
		player.fire();
	}
	
}

// problem 6
*/
class circle{
	
	int r;
	float pi= 3.41f;
	
	public int Diameter() {
		return 2*r;
	}
	public float Circumference() {
		return 2*pi*r;
	}
	public float area() {
		return pi *r*r;
	}
}
public class questions{
	public static void main(String args[]) {
		circle cq=new circle();
		cq.r=6;
		System.out.println(cq.Diameter());
		System.out.println(cq.Circumference());
		System.out.println(cq.area());
	}
}
