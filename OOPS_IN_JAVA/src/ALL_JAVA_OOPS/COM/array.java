package ALL_JAVA_OOPS.COM;

import java.sql.SQLOutput;

class ArrayExample {
    void maxArray(){
        int age[]={10,19,98,88};//ans98
        int ans=0;
        for (int i=0; i<age.length ; i++) {
            if(age[i]>ans){
                ans=age[i];
            }

        }
        System.out.println("max" +ans);
    }
//    void demoArray() {
//        int age[] = {10,10,10}; /*print sum of array*/
//        int sum=0;
//        for(int i =0;i<age.length;i++) {
//            sum = sum + age[i];
//        }
//        System.out.println(sum);

        //uper ka part ham khud valur assign kar ke kar rhe the toh isko avoid krne ke liya ham loop ka use kr sakte hai jaha ultiple value apne aap assign hoker prin hogi
//        System.out.println("length of the array is " +age.length);
//     /* normal loop  */   for(int i=0; i<=3;i++){
//            System.out.println(age[i]);
//        }
///*for each loop*/ for(int ages:age){
//            System.out.println(ages); /*same for jise sab print hoga isme ages nam ka memory banye jisme hamre agd ke value store hoker print hogi */
/*iske ek limitation hai isase ham pura array print kr sakte hai na ki jitna chiya utna*/
        }
//    }/
//void twoDArray(){
    //type one declration
//        int twoD[][]=new int [3] [3];
//        twoD[0][1]=10;
//        System.out.println(twoD[0][1]);
    //type 2 declration
//    int age[][]={{56,67,89},{67,6,8},{3,21,10}};
//    for (int i = 0; i < 3; i++) {
//        for (int j = 0; j < 3; j++) {
//            System.out.println(age[i][j]);
//
//        }

//    }
//}

//}
public class array {
    public static void main(String args[]){
        ArrayExample obj=new ArrayExample();
//        obj.demoArray();
//        obj.twoDArray();
        obj.maxArray();
    }
    }