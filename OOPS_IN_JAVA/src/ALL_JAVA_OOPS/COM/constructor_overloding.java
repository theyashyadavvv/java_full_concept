package ALL_JAVA_OOPS.COM;

public class constructor_overloding {
    int age;
    String name;
    String city;
    public void detail(){
        System.out.println("age" +this.age);
        System.out.println("name"+this.name);
        System.out.println("city"+this.city);
    }
    public constructor_overloding(){
        System.out.println("counstructor with non parameters");
    }
    //overloding
    public constructor_overloding(int st){
        System.out.println("counstructor with parameters");
    }
    public constructor_overloding(int a,String n,String c){
        int age=a;
        String name=n;
        String city=c;
        System.out.println("counstructor with  double parameters");
    }

    public static void main (String args[]){
        constructor_overloding s1= new constructor_overloding();

        s1.age=14;
        s1.name="yash";
        s1.city="mumbai";
        s1.detail();
        constructor_overloding s2=new constructor_overloding(12,"kritika","mumbai");
//        constructor_overloding s3=new constructor_overloding(12,"kritika");
        s2.detail();


    }
}
