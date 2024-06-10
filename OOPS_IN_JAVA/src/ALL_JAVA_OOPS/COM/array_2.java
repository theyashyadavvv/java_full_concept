package ALL_JAVA_OOPS.COM;
import java.util.*;
import javax.swing.*;
import java.sql.SQLOutput;

//how to take input in array from user

public class array_2 {
    //method for printing array
    static void print_array(int[] input){
        for(int i=0;i< input.length;i++){
            System.out.println(input[i] + " ");
        }
        System.out.println();
    }
    public static void main (String args[]){
    Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of array:");

            int input[]=new int[3];
            input[0]=10;
            input[2]=10;
           print_array(input);
            for(int i=0;i< input.length;i++){
                System.out.println(input[i] + " ");
            }
        //trying to copy array into copy array
            int copy[]=input;
       print_array(copy);

    }
}
