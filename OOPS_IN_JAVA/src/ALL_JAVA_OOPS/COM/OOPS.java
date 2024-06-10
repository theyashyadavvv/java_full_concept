package ALL_JAVA_OOPS.COM;

class car{
    String color;
    String name;
    public void view(){
        System.out.println("color  of the car=" + this.color);
        System.out.println("name of the car=" + this.name);
        //(this.) it is a key word of the java or this ya batata hai ki  function ko kis object ne call kia hai
    }

}
public class OOPS {
    public static void main(String arg[]){
        car car1=new car();
        car1.color="blue";
        car1.name="BMW";
       car1.view();
    }
}
