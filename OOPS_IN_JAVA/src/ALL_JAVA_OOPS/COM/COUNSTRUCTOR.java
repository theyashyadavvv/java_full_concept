package ALL_JAVA_OOPS.COM;

public class COUNSTRUCTOR {
    int age;
    String name;
    String city;
    //create counstructor it does not return the value that's why we don't need to wirte void int
//    name of the counstructor same as class name like class name is student then counstriuctor name is also student

    public COUNSTRUCTOR(int age,String name,String city){
        this.age=age;
        this.name=name;
        this.city=city;
        System.out.println("object created with values");



    }


    public static void main(String args[]){
        COUNSTRUCTOR  s1= new COUNSTRUCTOR (12,"yash","mumbai"); //object
        //1)if hamne koi constructor nhi banya toh computer by default counstructor bana deta hai jisme id 0 ayege name null, city null
        //2)after assign the value
        //used of constructor to inslized the object it is a method(function)

        System.out.println(s1.name); //1)output null 2)yash
        System.out.println(s1.age);//1)0  2)12
  System.out.println(s1.city);

    }



}
