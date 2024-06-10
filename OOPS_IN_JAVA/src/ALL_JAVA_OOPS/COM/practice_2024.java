package ALL_JAVA_OOPS.COM;
import java.util.*;


 class yash{
     void ram(){
         Scanner sc=new Scanner(System.in);
         System.out.println("enter the size of array:");
         int n = sc.nextInt();
         int array3[]=new int[n];
         System.out.println("enter tthe values in array:");
         for(int i=0;i< array3.length;i++){
             array3[i]=sc.nextInt();
         }
         for(int i =0; i< array3.length;i++){
             System.out.println(array3[i]);
         }
 }
 public class practice_2024 {
     public static void main(String args[]) {
         yash obj = new yash();
         obj.ram();
     }
 }
     }