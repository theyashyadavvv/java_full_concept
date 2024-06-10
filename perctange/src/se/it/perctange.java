package se.it;
import java.util.*;
public class perctange {
	public static float CalculatePerctange(int a, int b,int c, int d, int e) {
		int total= a+b+c+d+e;
		int percentage= total*100/500;
	}
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		int k= sc.nextInt();
		int s= sc.nextInt();
		int t= sc.nextInt();
		int z= sc.nextInt();
		int r= sc.nextInt();
		int perctanges=CalculatePerctange(k,s,t,z,r);
		System.out.println("perectange"+perctanges);
		
		
	}

}
