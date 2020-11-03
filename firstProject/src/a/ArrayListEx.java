package a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListEx {

	public static void main(String[] args) {
		
		ArrayList<Integer> list= new ArrayList<Integer>();
		list.add(27);
		list.add(5);
		list.add(64);
		list.add(61);
		list.add(1, 9);
		
//		for(int i=0;i<list.size(); i++) {
//			System.out.println(list.get(i));
//		}
//		
		//Collections.sort(list);
		
		for(int i=list.size()-1;i>=0; i--) {
			System.out.println(list.get(i));
		}
		
//		 Iterator itr=list.iterator();//getting the Iterator  
//		  while(itr.hasNext()){//check if iterator has the elements  
//		   System.out.print(itr.next());//printing the element and move to next  
//		  }  
//		
//		System.out.println(" ");
//		
//		int x[]= {2, 5, 6};
//		for(int i=0;i<x.length; i++) {
//			System.out.print(x[i]);
//		}
		
	}

}
