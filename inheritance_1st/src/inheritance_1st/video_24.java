package inheritance_1st;

class  animal{
	String animal_name;

	public String get_animal_name() {
		return animal_name;
	}
	public void set_animal_name(String animal_name) {
		this.animal_name=animal_name;
	}

}
class  Dog extends  animal {
	int age;
	public int get_age() {
		return age;
		
	}
	public void set_age(int age) {
		this.age=age;
	}
	
}
public class video_24 {
	public static void main(String args[]) {
		Dog a= new Dog();
		a.set_age(46);
		a.set_animal_name("roky");
		System.out.println(a.get_animal_name());
		System.out.println(a.get_age());
	}

}
