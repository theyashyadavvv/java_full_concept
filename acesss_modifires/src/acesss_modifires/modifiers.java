package acesss_modifires;

class employee{
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int i) {
		id = i;
		
		
	}
	public String get_name() {
		return name;
		
	}
	public void set_name(String n) {
		name =n;
	}
}
public class modifiers {
	public static void main(String args[]) {
		employee yash = new employee();
		/*yash.id =89;---------->throws  error due to private modifire acces (ager class ke object private hai toh . opeerator ke help se use acces nhi kar sakte
		yash.name="yashyadav";----->or isko hatne ke liya ham geter and seter ka use krte hai get and set nam ka function bante hai set name kuch return nhi krta get ham return krta hai
		
		
		System.out.println(yash.id);
		System .out.println(yash.name);
		
		*/
		
		yash.setId(58);
		System.out.println(yash.getId());
		yash.set_name("yash");
		System.out.println(yash.get_name());
	}

}
