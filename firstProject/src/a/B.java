package a;

public class B extends AbstractEx{

	public static void main(String[] args) {
		
		B ob= new B();
		ob.a();
		ob.b();
	}

	@Override
	public void b() {
		System.out.print("In child");
		
	}




}
