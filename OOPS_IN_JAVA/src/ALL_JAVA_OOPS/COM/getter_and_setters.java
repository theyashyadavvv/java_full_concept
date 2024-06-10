//etter and setter basically use in to access private property of the class iska use ham private prooperty ko access krne ke liya karte hai
  //iske ander getter hame return krta hai and setter use set krta hai kuch return nhi krta setter
//Getter in Java: Getter returns the value (accessors), it returns the value of data type int, String, double, float, etc. For the program’s convenience, the getter starts with the word “get” followed by the variable name.
//Setter in Java: While Setter sets or updates the value (mutators). It sets the value for any variable used in a class’s programs. and starts with the word “set” followed by the variable name. 
package ALL_JAVA_OOPS.COM;

import javax.swing.plaf.synth.SynthOptionPaneUI;

class book {
    private String name;
    private int id;

    /* makeing getter and setter to acess the private properties*/
    public int get_id() {
        return id;

    }
    public void set_id(int myId){
        id=myId;

    }
    public String get_name(){

        return name;
    }
    public void set_name(String myName){

        name= myName;
    }
}
public class getter_and_setters {
    public static void main(String args[]){
        book b1= new book();
        b1.set_id(90000);
        b1.set_name("twisted hate");
        System.out.println(b1.get_id());
        System.out.println(b1.get_name());
    }
}
