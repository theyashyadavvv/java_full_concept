package ALL_JAVA_OOPS.COM;

import java.util.Scanner;

class traversal{
     public static void user(){
         Scanner sc = new Scanner(System.in);
         System.out.println("enter the size of array:");
         int n = sc.nextInt();
         int array3[] = new int[n];
         System.out.println("enter the values in array:");
         for (int i = 0; i < array3.length; i++) {
             array3[i] = sc.nextInt();
         }
         for (int i = 0; i < array3.length; i++) {
             System.out.println(" ");
             System.out.println("array elements are :" +array3[i]);

         }
     }

}

//insert item in array
class insert {
    public static void value_insert() {
        //arr[3] = 37, 67, 78
//        condtion is that insert new value
//        location[1] (loc=1) , item= 100
//        arr[3+1]= 37 100 67 78
        int size, loc, item, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size:");
        size = sc.nextInt();  //4
        int arr[] = new int[size + 1]; // 4+1 = 5
        System.out.println("enter array element:");
        for (i = 0; i < size; i++) {
            arr[i] = sc.nextInt();   // |10 | 45|67|44|__|
            // }
            System.out.println("enter array location for put new element:");
            loc = sc.nextInt();  //loc=2 (45)
            System.out.println("enter the item for replace the location");
            item = sc.nextInt(); // item we want to add = 100
            for (i = size; i > loc; i--) {  //i=4    , condtion  4> 2 = true
                arr[i] = arr[i - 1];     // = arr[4-1] = 3 ==arr[3] become a empty    *** empty space
                // now  i =3  , condtion 3>2= true
                // arr[3-1] =2 == arry [2] become empty  ****empty space
                // i=2 , condtion 2>2 =false
            }

            arr[loc] = item;  //put item value in array location
            // arr [2]=100;
            size++;//increasing size of arry by 1 thats why size =5
            for (i = 0; i < size; i++) {
                System.out.println(arr[i] + " ");    //print arr[i]    10|20|100|30|40
            }


        }
    }

    class deletion {
        public static void delete() {
            Scanner sc = new Scanner(System.in);
            int size, loc, i;
            System.out.println("enter array size:");
            size = sc.nextInt();//3
            int arr[] = new int[size]; //arr[3]
            System.out.println("enter array elements:");
            for (i = 0; i < size; i++) {
                arr[i] = sc.nextInt(); // 23 , 45 ,67
            }
            System.out.println("enter array location:");
            loc = sc.nextInt(); //1
            for (i = loc; i < size - 1; i++) {          //i=1; 1<3-1(2) true
                arr[i + 1] = arr[i + 1];
            }
            size--;
            for (i = 0; i < size; i++) {
                System.out.println(arr[i]);
            }
        }
    }

    class search{
         //a[5]= 10 20 30 40 50
        //search item 30---->itrem found
        public static void searching(){

            Scanner sc = new Scanner(System.in);
            int count=0;
            System.out.println("enter array size:");
            int size= sc.nextInt();
            int arr[]= new int[size];
            System.out.println("enter the array values:");
            for (int i =0 ; i<size; i++){
                arr[i]=sc.nextInt();
            }
            for (int i =0 ; i<size; i++){
                System.out.println(arr[i] + " ");
            }
            System.out.println("enter search element:");
            int element= sc.nextInt();
           for (int i = 0 ; i<size; i++){
               if(arr[i]==element){

                   count ++;
               }
           }
           if(count >0){
               System.out.println("element found");
           }
           else{
               System.out.println("item not found sorry");
           }
        }
    }

    public class operations_array {
        public void main(String args[]) {
            search obj4 = new search();
            deletion obj3 = new deletion();
            traversal obj = new traversal();
            insert obj2 = new insert();
                obj2.value_insert();
        traversal.user();
            obj3.delete();
            obj4.searching();
        }

    }
}
