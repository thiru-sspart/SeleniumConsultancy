package a;

import java.util.Scanner;

public class ScanEx implements IntA {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//        int a = scan.nextInt();
//        int b= scan.nextInt();
//        String c = scan.next();
//   
////        int a= 9;
////        int b=5;
//        scan.close();
//        System.out.println(a+b);
//         System.out.println(c);
//          //System.out.println(c);
		
		ScanEx ob= new ScanEx();
		ob.a();
		ob.b();
		
	}

	@Override
	public void a() {
		System.out.print("In Method a in child");
		
	}

	@Override
	public void b() {
		System.out.print("In Method b in child");
		
	}

}
