package ALL_JAVA_OOPS.COM;

import java.util.Scanner;

class twoD {
    public static void twoD() {
//        int arr[][]=new int[3][2];
//        arr[0][0]=10;
//        arr[0][1]=20;
//        arr[1][0]=30;
//        arr[1][1]=40;
//        arr[2][0]=50;
//        arr[2][1]=60;

//        second method
        int num[][]={
            {10,20}, {30,40},{50,60}
        };

        for(int i=0 ; i<=2;i++){
            for(int j=0;j<=1;j++){
                System.out.print(num[i][j] + " ");
            }
            System.out.println("");

        }

    }
}
public class twoD_array {
    public static void main(String args[]){
        twoD obj = new twoD ();
        obj.twoD();
    }
}
