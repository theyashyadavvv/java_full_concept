package this_super_kerywords__in_java;
class ekclass{
	int a;
	public int get_a() {
		return a;
	}
	ekclass(int a){
	this.a=a;
		
}
	}
class beta extends ekclass{
	super(c);
	int y;
	
}
	
}

public class this_super {
	public static void main(String args[]) {
		ekclass e= new ekclass(66);
		System.out.println(e.get_a());
	}

}
