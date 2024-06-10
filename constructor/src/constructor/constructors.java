package constructor;

class employee{
	int id;
String name;
	
////	without arrgument constructor 
public employee () {
	id =45;
		name = "your name";
	}

//////	with arrgument in constructor
//	public employee(String myname, int myid) {
//		id=myid;
//		name=myname;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String n) {
//		name =n;
//	}
//	public int get_id() {
//		return id;
//	}
//	public void set_id(int i) {
//		id= i;
//		
//	}
//}
//
public class constructors {
	public static void main(String args[]) {
		employee yash= new employee();
		yash.name = "yash";
		yash.id=67;
	System.out.println(yash.name);
	System.out.println(yash.id);
	}

}
}
//		/*iske ander kya ham 1000employee ke liya ya .operator ka use kr ke likhte rahnege id or name 
//		 * toh code bahut bada ho jayeg a
//		 * to  iske liya ham jo employe nam ka object banye hai "employee yash= new employee();"		 * 
//		 * ise ke liya ek function bana denge jiske ander ham vaue pass karenge or output aa jayega;
//		 */
//		
////		first ke liya jisme arrgument pass nhi kiya hai
//		System.out.println(yash.name);
//		System.out.println(yash.id);
//		
//		System.out.println(yash.id);
//		
//		
//	}
//}
//
//class employee{
//	private  int salary;
//private String name;
//	
//public employee( int mysalary ,String myname) {
//	 salary =mysalary;
//	name =myname;
//}
//
//
//public String get_name() {
//	return name;
//}
//public void get_name(String n) {
//	this.name=n;
//}
//	public int get_salary() {
//		return salary;
//	}
//	public void set_salary(int s) {
//		this.salary=s;
//	}
//}
//public class constructors {
//	public static void main(String args[]) {
//		employee yash= new employee(800000,"yash");
////		yash.set_salary(600000);
//		System.out.println(yash.get_salary());
//		System.out.println(yash.get_name());
//	}
//}
//
