package array_practice_;

public class practice {
	public static  void main(String args[]) {
		// 1  practice problem --->1
//		float marks[]= {10f,10.1f,10f,10f,10f};
//		float sum = 0;
//		for(float element:marks) {
//			sum = sum+element;
//			
//		}
//		System.out.println("sum of float is: \n" +sum);
//		
	
		
//		2 write a program to find whether a given integer presnet in the array or not
//		int marks[]= {30,45,67,78,89};
//		int x=45;
//		boolean isInArray= false;
//		for (int element:marks) {
//		
//			if(x==element) {
//			isInArray=true;
//			break;
//			}
//		}
//			if(isInArray) {
//				System.out.println("element present in the array");
//			}
//			else {
//				System.out.println("element does not present in the array");
//			}
		
		
//		practice question 3
//int marks[]= {1,2,3,4,5,6};
//int sum =0;
//for(int element:marks) {
//	sum= sum +element;
//}
//int average= (sum)/5;
//System.out.println("average of physics marks is:"+average);
//}
//}
//	practice question 4 add two matrix  size of matrix 2*3  ************************************
//		int marks[][]=new int [2][3];
//		 nhi samjha yaa 
		
		
//	question number 5 reverse an array	
		
		int array[]= {1,2,3,4,5,6};
		int n = Math.floorDiv(array.length, 2);
		int temp;
		for(int i = 0; i<n;i++) {
			// swap the number a[i] snd a[l-1-i]
//			if  |3| |4| ya dono ko swap krna hai 3 ko 4 ke jagha or 4ko 3 ke jagh iske liya hamne temp nam ka ek or vairable liya jisme phle 3 jayega or 3 ke jagha 
		
			temp =array[i];
			array[i]=array[array.length-1-i];
			array[array.length-1-i]=temp;
		
		}
		for(int element: array) {
			System.out.println(element);
		}
		

	}
}
