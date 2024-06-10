package oops;
/* ek  java file me bass ek public class hoti hai is;iya isme public nhi ayega 
 * where employee is class and jo id;and string hai wo attributes hai class ke */

class  {               
	int id;
	String name;
	int salary ;
	/* creating one function */
	public void printdetails() {
System.out.println("your id" +this.  id);
System .out.println("your name"+this. name);
System.out.println("your salary"+this.salary);

		
		
//	}
//	public int salary() {
//		return salary;
//	}
}
public class custom {
	public static void main(String args[]) {
		System.out.println("this is our custom class");
		employee yash = new employee(); 
		employee abu = new employee();
		/* this ia a instaiating a new employee object*/
		/* setting a attributes  for yash*/
		yash.id=61;
		yash.name="yash";
	yash.salary=7000000;
	System.out.println("this is id" +yash.id);
		/* setting a attributes  for abu*/
		abu.id=17;
		abu.name="abu_khan";
abu.salary=50;
		/* printing the attributes*/
		/* function banya toh aab sidha call krne ka isko use nhi krna ka*/
//	System.out.println(yash.id);
//	System.out.println(yash.name);
//	System.out.println(yash.salary);
	yash.printdetails();
	abu.printdetails();
//	int getsalary= yash.salary();
//	System.out.println(yash.printdetails());
	}

}
}
