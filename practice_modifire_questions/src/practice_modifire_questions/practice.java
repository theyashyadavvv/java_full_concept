package practice_modifire_questions;




//*******************************************practice question 1***************************
//class cylinder{
//	int r;
//	int h;
////	float pi=3.14f;
//	public int get_r() {
//		return r;
//		
//	}
//	public void set_r(int r) {
//		this.r=r;
//	}
//	public int get_h() {
//		return h;
//	}
//	public void set_h(int h) {
//		this .h = h;
//	}
//	
//}
//public class practice {
//	public static void main(String args[]) {
//		cylinder mycylinder=new cylinder();
//		mycylinder.set_r(9);
//		mycylinder.set_h(12);
//		System.out.println(mycylinder.get_r());
//		System.out.println(mycylinder.get_h());
//		
//		
//		
//	}
//
//}

//******************************************practice question 2******************************

//class cylinder{
//	int r;
//
//int h;
//	float pi=3.14f;
//	public int get_r() {
//		return r;
//		
//	}
//	public void set_r(int r) {
//	this.r=r;
//	}
//public int get_h() {
//		return h;
//	}
//	public void set_h(int h) {
//		this .h = h;
//	}
//	public float surfaceArea(int r ,int h) {
//		float  a=2*r*h*3.14f+2*3.14f*r*r;
//		
//		return a;
//	}
//	public double volume(int r, int h) {
//	float v=3.14f*r*r*h;
//		return v;
//		
//	}
//}
//public class practice {
//	public static void main(String args[]) {
//		cylinder mycylinder=new cylinder();
//		mycylinder.surfaceArea(5,9);
//		mycylinder.volume(12,9);
//		System.out.println("surface area of cylinder is:" +mycylinder.surfaceArea(9,12));
//		System.out.println("vloume  of cylinder is:" +mycylinder.volume(9,8));
//		
//		
//		
//	}
//}




//*****************************************practice -3***************************************************
//class  cylinder{
//	int r;
//	int h;
//	public  cylinder(int myr,int myh){
//		 this.r=myr;
//		this. h=myh;
//		 
//		 
//	 }
//	public int get_r() {
//		return r;
//	}
//	public void  set_r(int r) {
//		this.r=r;
//	}
//	public int get_h() {
//		return h;
//	}
//	public void set_h(int h) {
//		this.h=h;
//	}
//	
//	 
//	
//}
//public class practice{
//	public static void main(String args[]) {
//		cylinder s= new  cylinder(5,6);
//		
//		System.out.println(s.get_r());
//		System.out.println(s.get_h());
//	}
//}
// ***********************************practice question 4*******************************************
class rectangle{
	private int l;
	private int b;
	public rectangle(){
		this.l=4;
		this.b=5;
	}
	public rectangle(int l,int b) {
		this.l=l;
		this.b=b;
	}
	public  int get_l() {
	 return l;
		
	}
	public void set_l(int l) {
		this.l=l;
		
		
	}
	public int get_b() {
		return b;
	}
	public void set_b(int b) {
		this.b= b;
	}
}
public class practice {
	public static void main(String args[]) {
		rectangle r = new rectangle ();
		System.out.println(r.get_l());
		System.out.println(r.get_b());
	}
	
}