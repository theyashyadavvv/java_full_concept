package homerwork_condtional_statment;
import java.util.*;
public class marks {
	public static void main(String args[]) {
		
		Scanner sc= new Scanner(System.in);
		
//		System.out.println("enter the physics marks");
//		int M1= sc.nextInt();
//		System.out.println("enter the chem marks");
//		int M2= sc.nextInt();
//		System.out.println("enter the chem marks");
//	int	M3= sc.nextInt();
//	float avg= (M1+M2+M3)/3.0F;
//	System.out.println("over all avg is" +avg);
//	if(avg>=40 && M1>=33 && M2>=33 && M3>=33 ) {
//		System.out.println("student is pass and move to the next claa");
//		
//	}
//	else {
//		System.out.println("student not be pass and she/he cannot be permoted");
//	}
		
		
//		Q6= web
		String web= sc.next();
		if(web.endsWith(".org")) {
			System.out.println("this is a orgingation website");
		}
		else if(web.endsWith(".com")) {
			System.out.println("this is a commercial website");
		}
		else if(web.endsWith(".in")) {
			System.out.println("this is a indian website");
		}
		
	}
	

}
