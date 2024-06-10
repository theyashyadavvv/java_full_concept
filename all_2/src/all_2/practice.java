package all_2;
import java.util.*;
//public class practice {
//	public static int sum(int a, int b) {
//		int c=a+b;
//		return c;
//	}
//	public static void main(String args[]) {
//		int x=6 ;
//		int y=9;
//		int add =sum(x,y);
//	System.out.print(add);
//		
//	}
//
//}
//public class practice{
//	public static void main (String args[]) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter the principal value");
//		int p = sc.nextInt();
//		System.out.println("rate");
//		int rate = sc.nextInt();
//		System.out.println("time");
//		int time=sc.nextInt();
//		int intrest =(p*rate*time)/100;
//		System.out.println(intrest);
//		
//	}
//}
//public class practice{
//	public static void main(String args[]) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter sub 1");
//		int sub1 = sc.nextInt();
//		System.out.println("enter sub 2");
//		int sub2 = sc.nextInt();
//		System.out.println("enter sub 3");
//		int sub3 = sc.nextInt();
//		int avg=(sub1+sub2+sub3)/3;
//		if(avg>=40 && sub1>=33 && sub2>=33 && sub3>=33) {
//			System.out.println("student pass");
//		}
//		else {
//			System.out.println("student fail");
//		}
//	}
//}

//loops
//public class practice{
//public static void main(String  args[]) {
//	
//	System.out.println("loop");
//	for(int n=10;n<=20;n++) {
//		System.out.println(n);
//	}
//	
//}
//}

//public class practice{
//	public static  int sum(int x,int y) {
//	int c;
//	{ if(x>=y) {
//		c= x+y;
//		System.out.println(c);
//	}
//	else if(y>=x) {
//		c = (x-y);
//	}
//	else {
//		c=x*y;
//	}
//	return c;
//		
//	}
//	}
//	public static void main (String args[]) {
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b=sc.nextInt();
//		
//	
//	System.out.println(sum(a,b));
//	}
//	
//}

//array
public class practice{
	public static void main (String args[]) {
		int a[]= new int[3];
		a[0]=9;
		a[1]=8;
		a[2]=7;
//		for(int i = 0;i<a.length;i++) {
//			System.out.println(a[i]);
//			}
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the no.of array:");
		int x=sc.nextInt();
				for(int i =0;i<=a.length;i++) {
					if(i==x) {
						System.out.println("yes");	
					}
					else {
						System.out.println(""
								+ "\"
								+ " no.");
					}
		}
		
	
		
		
		}
}
