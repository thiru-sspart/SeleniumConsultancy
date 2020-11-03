package a;

public class Addition {

	int x,y;
	
	public Addition(int x, int y) {
//		x= f;
//		y= k;
		this.x=x;
		this.y=y;
	}
	
	public Addition() {
		System.out.print("Hi");
	
	}
	
	public static void main(String[] args) {
		Addition a = new Addition(3, 4);
		a.add();
		Addition b = new Addition();

	}
	
	public void add() {
		int sum= x+y;
		System.out.print(sum);
	}

}
