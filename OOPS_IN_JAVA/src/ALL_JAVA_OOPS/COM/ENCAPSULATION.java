package ALL_JAVA_OOPS.COM;
class test{
    private int a=12;
    //mostly variable ko private rkhne ka hamesha or bhar kisi ko chiya hoga toh wo getter setter ka use kr lega
    public void show(){
        System.out.println("hii yash");
    }

}
public class ENCAPSULATION {

//iska ya matlb hai method or variable ek single class ke ander wrapp ho gaye (data)
  public static void main(String args[]){
     test c= new test();
     c.show();
  }
}
