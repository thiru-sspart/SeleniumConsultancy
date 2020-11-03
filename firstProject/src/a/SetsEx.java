package a;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetsEx {

	public static void main(String[] args) {
		HashSet<String> list= new HashSet<String>();
		list.add("e");
		list.add("a");
		list.add("a");
		list.add("s");
		list.add("d");
		
		Iterator itr= list.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next());
		}
		
		
		System.out.println("");
		
		TreeSet<String> li= new TreeSet<String>();
		li.add("e");
		li.add("a");
		li.add("a");
		li.add("s");
		li.add("d");
		
		Iterator it= li.iterator();
		while(it.hasNext()) {
			System.out.print(it.next());;
		}
		
	}

}
