package SE.IT;
import java.util.Scanner;
public class ATMExample {
	
	
	public static void main(String args[]) {
		int balance = 100000 , withdraw , deposit;
		Scanner sc = new Scanner (System.in);
		while(true) {
			System.out.println("Amounted teller machine");
			System.out.println("chose 1 for withraw");
			System.out.println("chose 2 for deposit");
			System.out.println("chose 3 for check balance ");
			System.out.println("chose 4 for Exit");
			System.out.println("choose operation you want  perform :");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("enter the monay to be withdraw: ");
				withdraw=sc.nextInt();
				if(balance >=withdraw) {
					balance = balance - withdraw ;
					System.out.println("please collect your mony");
				
				}
				else {
					System.out.println("Insufficent balance");
					System.out.println(" ");
					
					
					break ;
				}
					
					case 2:
						System.out.println("Eneter the money to be deposited");
						deposit = sc.nextInt();
						balance = balance+deposit;
						System.out.println("your money has been succeesfully deposited");
						System.out.println("");
						break;
					case 3:
						System.out.println("Balance :" +balance);
						
						
						
				}
			}
		
			
		}
	}


