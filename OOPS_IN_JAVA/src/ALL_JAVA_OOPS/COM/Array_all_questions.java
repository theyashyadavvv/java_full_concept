package ALL_JAVA_OOPS.COM;

public class Array_all_questions {
    public static void main(String args[]){
        //wap to find max element in array[2,3,4,6,8,1,7]
        int array[]={2,-3,4,1,6,-5,9,2};
        int max_1=array[0];
        int max_2=array[0];
        for(int i=1;i< array.length;i++){
            if(array[i]>=max_1){
                max_2=max_1;
                max_1=array[i];
                System.out.println(max_1);
            } else if (array[i]>=max_2) {
                max_2=array[i];
                System.out.println(max_2);

            }
        }

    }
}
