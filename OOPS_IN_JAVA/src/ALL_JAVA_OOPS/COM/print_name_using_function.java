package ALL_JAVA_OOPS.COM;

import java.util.Scanner;

public class print_name_using_function {
    public static void factorial(int n) {
        int factorial=1;
for (int i=n; i>=1;i--){
    factorial= factorial*i;


}
        System.out.println(factorial);

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number :");
       int n = sc.nextInt();

       factorial(n);

    }
}
