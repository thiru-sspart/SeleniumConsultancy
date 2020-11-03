package a;

public class A {

	public A() {
		System.out.print("In constructor");
				
	}
	
	int x= 5;
	int x1= 8;
	int g= 8;
	
	int i[]= {5,8,8};
	
	public void printing()
	{
		System.out.print("Hi");
	}
	
	public static void main(String[] args) {
//		A obj= new A();
//		obj.printing();
//		obj.a1();
//		System.out.print(obj);
//		A o2= new A();
//		System.out.print(o2);
		
		StaticEx ob= new StaticEx();
		System.out.print(ob.y);
		System.out.print(StaticEx.x);
		ob.m2();
		StaticEx.m1();
	}
	
	protected void a1() {
		System.out.print("Hello");
	}
	

}
