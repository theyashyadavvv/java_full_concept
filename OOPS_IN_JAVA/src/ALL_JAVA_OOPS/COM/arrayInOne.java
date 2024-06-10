package ALL_JAVA_OOPS.COM;
import java.util.*;
class practice{
//    *****in this step we learn basics about array how to create how to print values*************
   /* void practice1(){
        int array1[]=new int[4];
       array1[0]=10;
       array1[1]=9;
       array1[2]=8;
       array1[3]=7;
        System.out.println(array1[0]);
        System.out.println(array1[1]);
        System.out.println(array1[2]);
        System.out.println(array1[3]);
    }*/
    //in this step we leaarn second way to create and print the array
    /*void practice2(){
        int array2[]={10,2,3,4,5,6};
        System.out.println(array2[0]);
        System.out.println(array2[1]);
        System.out.println(array2[2]);
        System.out.println(array2[3]);

    }*/





}
public class arrayInOne {
    public static void main(String args[]){
        //    now this main step where we lear how to use loop to create print the array
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
//        practice obj=new practice();
//        obj.practice1();
//        obj.practice2();
//        obj.practice3();

    }
}
