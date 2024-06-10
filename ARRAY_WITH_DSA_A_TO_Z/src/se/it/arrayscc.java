package se.it;
import java.util.*;
public class arrayscc {
	public static void main(String args[]) {
		/*how to define array 
		 * in different methods
		 */
		
/*		int marks[]=new int[50];
		int numbers[]= {1,2,3};
		String name[]= {"yash","kashish"};
		
		
		*/
		
		
		/* HOW TO TAKE INPUT FROM USER IN ARRAY
		 * 
		 */
		
	int marks[]=new int[10];
	Scanner sc= new Scanner(System.in);  /* becusse to take input from user*/
	
	System.out.println("enter the physics marks");
	marks[0]=sc.nextInt();
	System.out.println("enter the maths marks");
	marks[1]=sc.nextInt();
	System.out.println("enter the chem marks");
	marks[2]=sc.nextInt();
	
	System.out.println("physics" +marks[0]);
	System.out.println("maths" +marks[1]);
	System.out.println("chem" +marks[2]);
////	 IF UPDATE ANY MARKS IT IS ALSO DOO
		marks[2]=100;
		System.out.println("maths" +marks[2]);
		
////		if add any marks
		marks[1]= marks[2]+1;
		System.out.println("physics" +marks[1]);
////		if i want % of all subject
		int percentage=(marks[0]+marks[1]+marks[2])/3;
		System.out.println("percentage =" +percentage +"%");
////	 if we want length of array
		System.out.println("length of array=" +marks.length);
//		
		
//		HOW TO DISPLAY ARRAY USING LOOP 
		for(int i=0;i<=marks.length;i++) {
			System.out.println(marks[i]);
			
			
			
//			TO find element presnet in the array
			for(int element:marks) {
				System.out.println(element);
			}
		}
	
	}

}
