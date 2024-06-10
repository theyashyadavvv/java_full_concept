package binary_search_with_recuerssion;

public class exampls {
	public static int search(int []array,int target,int start, int end) {
		if (start>end) {
			return -1;
		}
		
		int mid= start+(end-start)/2;
		if(array[mid]==target) {
			return mid;
			
		}
		if(target<array[mid]) {
			search(array,target,start,mid-1);
			
		}
	}
	public static void main(String args[]) {
		
	}

}
