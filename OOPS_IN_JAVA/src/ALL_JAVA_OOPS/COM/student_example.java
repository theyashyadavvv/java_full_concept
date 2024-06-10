package ALL_JAVA_OOPS.COM;
class student{
    String name;
    int age;
     public void printInfo(){
         System.out.println("print name" +this.name);
         System.out.println("print age" + this.age);
     }
}
public class student_example {
    public static void  main(String arg[]){
        student s1= new student(); // NEW IS KEY WORD EK JISE IS KEY WORD KA USE KIA MEMOMORY HEAP KE ANDER JAGHA (SPACE CREATE HO JAYEGI) AND STUDENT() YA CONSTRUCTOR HOTE HAI
        s1.name="yash";
        s1.age=22;
        s1.printInfo();
    }
}
