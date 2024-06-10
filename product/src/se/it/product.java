package se.it;
import java.util.*;
public class product {
	public static int PrintProduct(int a,int b) {
		int product=a*b;
		return product;
		
	}
	public static void main(String args[]) {
		Scanner sc= new Scanner (System.in);
		System.out.println("enter the a ");
		int a= sc.nextInt();
		System.out.println("enter the b ");
		int b=sc.nextInt();
		int products=PrintProduct(a,b);
		System.out.println("the product of 2 number is "+products);

		
		
		
		
	}

}
