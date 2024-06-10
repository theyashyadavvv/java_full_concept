package guess_the_number_ex_3;

	
	public int get_No_of_gussses() {
		return no_of_gussses;
	}
	public void set_No_of_gussses(int no_of_gussses) {
		this.no_of_gussses=no_of_gussses;
		
	}

	void takeuserinput() {
		System.out.format("Yes you guessed it right, it was %d\nYou guessed it in %d attempts", number, no_of_gussses);
		 Scanner sc = new Scanner(System.in);
		 input_number=sc.nextInt();
		 
		 
		// TODO Auto-generated method stub
		
	}
	 

	 boolean  iscorrectnumber() {
		if (input_number==number) {
			return true;
		}
		
		
	 else if (input_number<number) {
		System.out.println("very high.....");
		
	}
		else if(input_number>number) {
			
			System.out.println("very low.....");
		}
		return false;
	}
	
}






public class game {
	public static void main(String args[]) {
		game g =new game();
		boolean b= false;
		while(!b){
	        g.takeuserinput();
	        b = g.iscorrectnumber();
	        }
	}

	
}
