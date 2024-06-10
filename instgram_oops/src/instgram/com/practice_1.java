package instgram.com;
class student{
    int id;
    String name;
    String city;

    public void printInfo(){
        System.out.println(this.id);
        System.out.println(this.name);
        System.out.println(this.city);

    }

}
public class practice_1 {
    public static void main(String args[]){
        //creating a object for class student
     student s1=new student();
     s1.id=98;
     s1.name="yash";
     s1.city="mumbai";

s1.printInfo();
    }

}
