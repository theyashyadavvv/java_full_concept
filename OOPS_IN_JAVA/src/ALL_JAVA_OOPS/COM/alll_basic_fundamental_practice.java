package ALL_JAVA_OOPS.COM;

import java.util.Scanner;

public class alll_basic_fundamental_practice {
    public static int avg(int a , int b , int c){
        Scanner sc= new Scanner(System.in);
        int d = a+b+c;
        int e= d/3;
        System.out.println(e);
        return e;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        avg(a,b,c);

    }

}
