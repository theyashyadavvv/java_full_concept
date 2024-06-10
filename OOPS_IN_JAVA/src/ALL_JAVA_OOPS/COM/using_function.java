package ALL_JAVA_OOPS.COM;
class kashish{
    String name;
    String type;
    int age;
    int angery_level;
    String fav_pearson;

    public void printInfo(){
        System.out.println("my name is " + this.name );
        System.out.println("my type is" + this.type);
        System.out.println("my angery level is " + this.angery_level);
        System.out.println("my fav person is"+ this.fav_pearson);


    }

}
public class using_function {
    public static void main(String args[]){
        kashish v1=new kashish();
        v1.name="kashu";
       v1.age=20;
       v1.type="akdu";
       v1.angery_level=100;
       v1.fav_pearson="yashu";
        v1.printInfo();

    }
}
