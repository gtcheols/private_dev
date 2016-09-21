
public class Main {

	private int val = 0;
	
	public Main() {
		val = 1;
	}
	
	public int getVal(){ return val; }
	
	public static void main(String[] args){
		System.out.println("Hello JAVA." + (new Main()).getVal());
	}

}
