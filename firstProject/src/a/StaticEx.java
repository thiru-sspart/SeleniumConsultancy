package a;

public class StaticEx {

	static int x=5;
	int y=7;
	
	public static void m1() {
		System.out.print("In method1");
//		StaticEx ob= new StaticEx();;
//		ob.m2();
	}
	
	public void m2() {
		m1();
		System.out.print("In method2");
	}
	public void m3() {
		m2();
		System.out.print("In method2");
	}
	
	public static void main(String[] args) {
		StaticEx ob= new StaticEx();
		System.out.print(ob.y);
		System.out.print(x);
		ob.m3();
		//m1();
	}
	static {
		System.out.print("In satic block");
	}

}
