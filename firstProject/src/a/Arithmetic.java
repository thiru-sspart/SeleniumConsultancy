package a;

public class Arithmetic extends Maths{

	public static void main(String[] args) {
		Arithmetic a= new Arithmetic();
		a.display();
		//Maths ob = new Maths();
		//a.add(5, 6);
//		a.addition(3,4, 5);
//		a.addition(4 ,5);
//		a.addition("hi");
	}
	
	public void display() {
		super.display();
		System.out.println("Hi");
	}

	public void addition(String a) {
		System.out.print(a);
	}
	public void addition(int x, int y) {
		System.out.println(x+y);
	}
	
	public void addition(int x, int y, int z) {
		System.out.println(x+y+z);
	}
}
