package oops_practice_all_the_concept;
//import java.util.*;





//********************types one using property ******************************************

//class girlfriends{
//	String name;
//	int age;
//String type;
//	int meet_day;
//	int brekup_day;
//
//	
//}
//	
//	
//////public void printdetails() {
////	System.out.println("your gf name" +this.name);
////	System.out.println("your gf age:" +this.age);
////	System.out.println("your gf type" +this.type);
////	System.out.println("both od you meet" +this.meet_day);
////}
////}
//
//
//public class practice {
//	public static void main (String args[] ) {
//		
//		System.out.println("your gf detail");
//		girlfriends  sudha= new girlfriends ();
//		sudha.name="sudha";
//		sudha.age=20;
//		sudha.type="good";
//		sudha.meet_day=13-5-21;
//		sudha.brekup_day=0;
////		sudha.printdetails();
//		System.out.println(sudha.name);
//		System.out.println("your gf age:" +sudha.age);
//		System.out.println("your gf type" +sudha.type);
//		System.out.println("both od you meet" +sudha.meet_day);
//	}
//		
//	}


//**************************************using method(function)************************************************

//class student{
//	
//	String name;
//	int roll_no;
//	float percentage;
//	 public void studentDetail() {
//		 System.out.println("student name:" +this.name );
//		 System.out.println("student roll:" + this.roll_no);
//		 System.out.println("student percentage:" +this.percentage );
//
//
//	 }
//	
//}
//public class practice{
//	public static void main(String args[]) {
//		student yash=new student();
//		yash.name="yash yadav";
//		yash.roll_no=61;
//		yash.percentage=68f;
//		yash.studentDetail();
////		System.out.println(yash.studentDetail());
//	}
//}


// *********************************************getter_&_setters ***************************************************


/*getter and setter basically use in to access private property of the class iska use ham private prooperty ko access krne ke liya karte hai
 * iske ander getter hame return krta hai and setter use set krta hai kuch return nhi krta setter 
 * 
 * 
 * */
//class student{
//	
//	/*           property  of the class      */
//private int id;
//private String name;

//
///* makeing getter and setter to acess the private properties*/
//public int get_id() {
//	return id;
//	
//}
//public void set_id( int myid) {
//	id=myid;
//}
//public String get_name() {
//	return name;
//}
//public void set_name(String myname) {
//	name=myname;
//	
//}
//
//
//}
//public class practice{
//	public static void main(String args[]) {
//		student yash = new student();
//		yash.set_name("yash");
//		yash.set_id(67);
//		System.out.println("your name:" + yash.get_name());
//		System.out.println("your id:" +yash.get_id());
//	}
//}
//


// ****************************************************counstructor**********************************************
/*
 * abbb ham counstructor ka use isliya karte hai becuse har barr . product ka use kr ke ham kitne baar likh sakte hai
 * isa karte karte bahut jada coude ho jayega for example"
 *yash.set_name("yash");
		yash.set_id(67);
		" bahut time tak karne se aja object ka ek function bana kr uske ander object dal kr use call kr sakte hai or ise hi  counstructor khte hai
		or ek chiz imp**********counstructor kuch return nhi krta 
 
 * 
 * 
 */
 class student{
	 private int id;
	 private String name;
	 
	 public int get_id() {
		 return id;
		 
	 }
	 public void set_id(int myid) {
		 id=myid;
	 }
	 public String get_name() {
		 return name;
	 }
	 public void set_name(String myname) {
		 name =myname;
	 }
	 public student() {
		  id =56;
		name="yash";
	 }
	 
	 /*
	  * ham constructor ke ander argument bhi pass kr sakte hai
	  */
	 public student(int myid,String myname) {
		 id=myid;
		 name=myname;
	 }
	 
 }
 public class practice{
	 public static void main(String args[]) {
		 student yash = new student();
		 student yashuu=new student(58,"kashish");
		 System.out.println("your_id" +yash.get_id());
		 System.out.println("your name" + yash.get_name());
		 System.out.println("your_id" +yashuu.get_id());
		 System.out.println("your name" + yashuu.get_name());
		 
	 }
 }
 
 
 
 
