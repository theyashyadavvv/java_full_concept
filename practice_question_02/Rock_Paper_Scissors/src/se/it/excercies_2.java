package se.it;

import java.util.random.*;

import java.util.*;

public class excercies_2 {
	public static void main(String args[]) {
//		1-->for rock
//		2--->paper
//		3--->scissor
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER 0 FOR ROCK, 1 FOR PAPER,2 FOR SCISSOR");
		int user_input=sc.nextInt();
		Random random = new Random();
		int computer_input= random.nextInt(3);
		if(user_input==computer_input) {
			System.out.println("match draw");
			
		}
		else if(user_input==0 && computer_input==2 || user_input==1 && computer_input==0 || user_input==2 && computer_input==0)
		{
			System.out.println("user win");
		}
		else {
			System.out.println("computer win");
		}
		System.out.println("computer choice"+computer_input);
		
	}

}
