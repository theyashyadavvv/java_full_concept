package all_in_one_01;
import java.util.*;
//public class full{
//	public static void main(String args[]) {
//		Scanner sc = new Scanner (System.in);
//		System.out.println("enter the Celcius  value:");
//		double Celcius = sc.nextDouble();
//		double fahrenheit = (Celcius/1.8f)+32;
//		System.out.println( "the fahrenheit value:" +fahrenheit);
//		
//	}
//	
//}
//**************************simple intrest*******************
//public class full{
//	public static void main(String args[]) {
//		Scanner sc = new Scanner (System.in);
//		System.out.println("enter Principal:");
//	int Principal= sc.nextInt();
//		System.out.println("enter rate:");
//		int rate=sc.nextInt();
//		System.out.println("enter time");
//		int time=sc.nextInt();
//		float simple_intrest=( Principal*rate*time)/100;
//		System.out.println("simple intrest is" +simple_intrest);
//		
//		
//		
//	}
//}
//*****************************************Wap to check number is disvisible by 97**********************************
//public class full{
//	public static void main(String args[]) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter the number wich is divide by 97");
//		int n = sc.nextInt();
//		if (n%97==0) {
//			System.out.println(" number wich is divide by 97");
//			
//		}
//		else {
//			System.out.println("number wich is not divide by 97");
//		}
//	}
//}

//Wap to find student is passed or fail. It requires total 40% and atleast 33% in each subj.(Assume 3  subj)*******************
//public class full{
//	public static void main(String args[]) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter your  marks kashih verma");
//		System.out.println("enter your firs sub :");
//		int sub_1 = sc.nextInt();
//		System.out.println("enter your firs sub marks :");
//		int sub_2=sc.nextInt();
//		System.out.println("enter your firs sub marks :");
//		int sub_3=sc.nextInt();
//		int avg=(sub_1+sub_2+sub_3)/3;
//		if(avg>=40&& sub_1>33&&sub_2>33&&sub_3>33) {
//			
//			System.out.println(" kashih verma u are pass and move to the next class");
//		}
//		else {
//			System.out.println(" kashih verma lol you are fail jaker ghas charao ganja chodega nhi tumhe");
//		}
//		
//	}
//}
// 
// check the condtion opertors are true or false************************************
//public class full{
//	public static void main(String args[]) {
//		boolean a= true;
//		boolean b =false;
//		System.out.println("for logical && operator");
//		if (a && b) {
//			System.out.println("yes");
//			
//		}
//		else {
//			System.out.println("no");
//			
//		}
//		System.out.println("for logical or operator");
//		if(a || b) {
//			System.out.println("yes");
//		}
//		else {
//			System.out.println("no");
//		}
//		System.out.println("for not opertor");
//		if (a!=b) {
//			System.out.println("yes");
//		}
//		else {
//			System.out.println("no");
//		}
//		
//	}
//}
//*******************************************loops**************************************
//sum of first 3 even number;
//public class full{
//	public static  void main(String args[]) {
//		int sum =0;
//		int n =3;
//		for(int i =0;i<n;i++) {
//			 sum = sum + (2*n);
//			System.out.print("sum of even is"+sum);
//		}
//		Scanner sc = new Scanner(System.in);
//	System.out.println("enter the number for print the table of that number");
//	int n= sc.nextInt();
//	for(int i=1;i<=10;i++) {
//		int table= n*i;
//		System.out.println(table);
////	}
//		int n=13;
//		for(int i=10;i>=0;--i) {
//			int table= n*i;
//			System.out.println(table);
//		}
//	}
//}
		
//		*************************************METHODS/FUNCTIONS IN JAVA**************************
//		public class full{
//			public static int printsum(int a ,int b) {
//			int c= a+b;
//			return c;
//		}
//			public static void main(String args[]) {
//				
//				Scanner sc = new Scanner(System.in);
//				int x ,y;
//				 x =sc.nextInt();
//				 y = sc.nextInt();
//				int add = printsum(x,y);
//				System.out.println(add);

//				
//				
//			}
//			
//		}
//public class full{
//	public static int hello(int x ,int y) {
//		int sum ;
//		if (x>y) {
//			sum=x+y;
//			
//		}
//		else {
//			sum=(x-y)*5;
//		}
//		return sum;
//		
//		
//	}
//	public static void main (String args[]) {
//		Scanner sc= new Scanner (System.in);
//		int a=sc.nextInt();
//		int b=sc.nextInt();
//		int add = hello( a,b);
//		System.out.println(add);
//		
//	}
//}
//***********************************************array***************************************
// iske ander tune batya array ka syntax*********************
//public class full {
//	public static void main(String args[]) {
//		int marks[]=new int[3];
//	marks[0]=97;
//	marks[1]=97;
//	marks[2]=97;
//	for(int i =0;i<3;i++) {
//		System.out.println(marks[i]);
//	}
//	
//		
//	}
//}


// iske ander tune array ka size lia input lia or output dia*********************

public class full{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int size = sc.nextInt();
		int number[]=new int[size];
		for(int i=0;i<size;i++) {
//			size of array
			System.out.println(number[i]);		
//			input value  in array
			 number[i]=sc.nextInt();
			
		}
	}
}
////		for out put of the array jo number dala wahi output mile ga
//		
//		for(int i=0;i<number.length;i++)
//		System.out.println(number[i]);
//		
//	}
//}

// aab tujhe ek number search krna hai array ke ander****************************************************
//public class full{
//	public static void main(String args[]) {
//		Scanner sc= new Scanner (System.in);
//		System.out.println("enter the size of array");
//		int size = sc.nextInt(); 
//		int number[]=new int[size]; 
//		for(int i=0;i<size;i++) {
//			System.out.println("enter the value"); 
//			number[i]=sc.nextInt();
//			
//			
//		}
//		System.out.println("enter the found number x");
//		int x = sc.nextInt();
//		for(int i =0;i<size;i++) {
//			if(number[i]==x) {
//				System.out.println("number found in the array index " +i);
//			}
//			
//				
//			}
//		
//			
//		}
//	}
//	
//
//**********************multidimention array**************************************

//public class full{
//	public static void main(String args[]) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the size of array:");
//		int row=sc.nextInt();
//		int coloum =sc.nextInt();
//		int marks[][]=new int[row][coloum];
//		for(int i =0;i<row;i++) {
//			for(int j =0;j<coloum;j++) {
//				marks[i][j]=sc.nextInt();
//			}
//			
//			
//			
//		}
//		for(int i =0;i<row;i++) {
//			for(int j =0;j<coloum;j++) {
//				System.out.print(marks[i][j] +" ");
//			}
//			System.out.println();
//			
//		}
//	}
//}
//public class full{
//	public static void main (String args[]) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter the size of array:");
//		int row=sc.nextInt();
//		int coloum = sc.nextInt();
//		int flat[][]=new int[row][coloum];
//		flat[0][0]=102;
//		flat[0][1]=102;
//		flat[0][2]=102; 
//		flat[1][0]=102;
//		flat[1][1]=102;
//		flat[1][2]=102;
//		for(int i = 0;i<row;i++) {
//			for(int j=0;j<coloum;j++) {
//				System.out.print(flat[i][j] +" ");
//			}
//			System.out.println();
//			
//		}
//		
//		
//	}
//}

//***************************************practice question on array***************************
//creat 5 floats array and there sum
//public class full{ 
//	public static void main(String args[]) {
//		float marks[]=new float [3];
//		marks[0]=0.1f;
//		marks[1]=0.8f;
//		marks[2]=0.5f;
//		float sum=0;
//		for(float element:marks) {
//			sum=sum+element;
//					}
//		System.out.print("sum of array\n" + sum);
//
//	}
//}
//find the given integer presnt in the arry or not
//public class full{
//	public static void main(String args[]) {
//		it is my method*******************************
//		int number[]= {1,2,3,4,5};
//		int n=5;
//		for(int i = 0;i<number.length;i++) {
//			if(number[i]==n) {
//				System.out.println("integer present in the array" +i);
//			} 
//		***********harry ka method**********************
//		int marks[]= {4,5,6,7};
//		int x=7;
//		boolean isInArray=false;
//		for(int element:marks) {
//			if(x==element) {
//				isInArray=true;
//				break;
//			}
//		}
//			if(isInArray) {
//				System.out.println("element present in the array");
//			}
//			else {
//				System.out.print("element not present in the array");
//				
//			}
//			
//		}
////			
////		} 
//	}
		
//		********************sum of int***********
//		public class full{
//			public static void main(String args[]) {
//				int marks[]= {1,2,3,4,5,6};
//				int sum=0;
//				for(int element:marks) {
//					sum=sum+element;
//				}
//				int avg=sum/marks.length;
//				System.out.println("avg og int" +avg);
//				
//			}
//			
//		}
//******************************** add twoo martix 2*3******************************
//public class full{
//	public static void main(String args[]) {
//		int mat1[][]= {{1 , 2 , 3} ,
//				       {2 ,3 , 4 }	};
//		int mat2[][]={{23 , 24 , 35} ,
//			          {22 ,33 , 44 } };
//		int result[][]={{0 , 0 , 0} ,
//			            {0 ,0 , 0}	};
//		for(int i=0;i<mat1.length;i++) {
//			for(int j=0;j<mat1[i].length;j++) {
//				result[i][j]=mat1[i][j]+mat2[i][j];
//				System.out.print(result[i][j] +" ");
//				
//			}
//			System.out.println();
//			
//			
//		}
//}
//}
			
		
//		******************************************aarrry reverse************************
		
//		public class full{
//			public static void main(String args[]) {
//				int array[]= {1,2,3,4,5,6,};
//				for(int i=array.length;i>1;--i) {
//					System.out.println(array[i]);
//				}
//			}
//		}
			
//************************oops**********************************************************end48
//basic oops jism ham ek clas banete hai or uski property ko acess krte hai******************
//class student{
//	int marks;
//	String name;
//}
//public class full{
//	public static void main(String args[]) {
//		student yash=new student();
//		yash.marks=87;
//		yash.name="yashuu";
//		System.out.println("your marks:" +yash.marks);
//		System.out.println("your name:" +yash.name);
//	}
//}
//		
//**************ek  class banan hai jiske ander kuch functions lene hai hai or uska use kr ke hame uski property ko acess krna hai**********
//class employee{
//	int salary=5000;
//	int age=90;
//	String name;
//	public void display() {
//		System.out.println("your salary:" +this.salary);
//		System.out.println("your age:" +this.age);
//		System.out.println("your name:" +this.name);
//		
//	}
//}
//public class full{
//	public static void main(String args[]) {
//				employee e=new employee();
//		e.salary=000;
//		e.age=00; 
//		e.name="ram";
//		e.display();
//	}
//}
			
//	*************************getter and setter***************
//class employee{
//	private int age;
//	 String name;
//	public  int get_age() {
//		return age;
//		
//		
//	}
//	public void set_age(int myage) {
//		this.age=myage;
//		
//	}
//	
//
//			 
//	public  void  detail() {
//		System.out.println(this.age);
//		System.out.println(this.name);
//		
//		
//	}
//			
//}
//public class full{
//public static void main (String args[]) {
//	employee e=new employee();
//	e.set_age(67);
//	e.name="yash";
//	e.detail();
//}
//}

//********************************counstructor******************************
//ager counstrouctor hai toh hame set nhi krna padta koi bhi value
// first wee se without arrgument counstructor************

//class employee{
//private	int id;
//	String name;
//public int get_id() {
//	return id;
//}
//public void set_id(int id) {
//	this.id=id;
//	
//}
//employee(){
//id=78;
//name="yash";
//}
//	
//}
//public class full{
//	public static void main(String args[]) {
//		employee e= new employee();
//	
//		System.out.println(e.name);
//		System.out.println(e.get_id());
//		
//		
//	}
//}

//************with argument*********************************
//class employe{
//	int id;
//	String name;
//	  employe(int id,String name) {
//		  this.id=id;
//		  this.name=name;
//		 
//	 }
//	  
//	  public int get_id() {
//		  return id;
//		  
//	  }
//	  public void set_id(int id) {
//		  this.id=id;
//	  }
//	  public String get_name() {
//		  return name;
//	  }
//	  public void set_name(String name) {
//		  this.name=name;
//	  }
//}
//public class full{
//	public static void main(String args[]) {
//		employe e= new employe(54,"yash");
//		System.out.println(e.get_id() +" "+ e.get_name());
//	}
//}
//******************************inhetitance***********************
//class phone{
//	public void on() {
//		System.out.println("phone on..");
//	}
//}
//class smartphone extends phone{
//	public void off() {
//		System.out.println("phone of..");
//	}
//	
//}
//public class full{
//	public static void main(String args[]) {
//		smartphone smart=new smartphone();
////		phone p=new phone();
//	smart.on();
//	smart.off();
//	}
//}


			 
				

		
