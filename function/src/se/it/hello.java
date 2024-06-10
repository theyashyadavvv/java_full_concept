package se.it;
import java.util.*;

public class hello {
	public static int logic(int x,int y) {
		int sum;
	
		if (x>y) {
			sum=x+y;
		}
		else {
			sum=(x-y)*5;
			
		}
	return sum;
			
		}
	
	public static void main(String args[]) {
		int a= 6;
		int b=10;
		int add= logic(a,b);
		System.out.println(add); 
		
		
	}

	}	