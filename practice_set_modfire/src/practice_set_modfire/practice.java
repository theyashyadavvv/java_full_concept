package practice_set_modfire;
class cylinder{
	private int radious;
	private int height;
//	float pi=3.14f;
//	int volume;
//	public int get_radious() {
//		return radious;
//	}
//	public void set_radious(int radious) {
//		this.radious=radious;
//	}
	public int get_height() {
		return height;
	}
	public void  set_height(int height) {
		this.height=height;
	}
	
	
}
public class practice {
	public void main(String args[]) {
		cylinder mycylinder=new cylinder();
	mycylinder.set_height(12);
	int h=mycylinder.get_height();
		System.out.println(h);
		
	}

}
