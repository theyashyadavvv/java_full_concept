package se.it;
import java .util.*;
//string is a class
public class string {
	public static void main(String args[]) {
//		STRING DECLERATION 
Scanner sc = new Scanner(System.in);


String name = sc.nextLine(); /* yaaha next () likhnge toh sirf ek word output ayega or nextLine() likhnge toh puri line output ayega */
String midname=sc.nextLine();
String lastname=sc.nextLine();
String full_name=  midname +" " + lastname;
//System.out.println("enter yout name : "+ full_name);



System.out.println(full_name.length());
// charArt
for(int i =0; i< full_name.length() ; i++) {
	
	System.out.println(full_name.charAt(i));
	
}

	}

}
