package ALL_JAVA_OOPS.COM;
import java.util.*;
public class copyArray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        int b[]=new int[5];
        System.out.println("enter the first array value");
        for(int i=0;i<5;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("print all the value:");
        for(int i=0;i<5;i++){
            System.out.println(a[i]);
        }
        System.out.println("second copy array of first array:");

        for(int i=0;i<5;i++) {
         b[i] =  a[i];
            System.out.println(b[i]);

        }
    }
}
