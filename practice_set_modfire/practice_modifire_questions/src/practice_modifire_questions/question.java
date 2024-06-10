package practice_modifire_questions;
class circle{
	
	int r;
	circle(int r){
		this.r=r;
		System.out.println("i ame circle counstroctur with paramiter");
	}
float pi=3.14f;
public float area() {
	float a= pi *this.r*this.r;
	return a;
	
}
	
}
class cylinder extends circle{
	cylinder(int r,int h){
		super(r);                             //parent ka counstructor run karega super
		this.h=h;
		System.out.println("i ame cylinder counstroctur with paramiter");
	} 
int h;
	public float volume() {
		float v=pi *this.r*this.r*this.h;
		return v;
	}
	
}
public class question {
	public static void main(String args[]) {
		cylinder solution=new cylinder(5 ,5);
		

	System.out.println(solution.volume());
		
	}
 
}
