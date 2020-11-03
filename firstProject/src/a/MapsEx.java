package a;

import java.util.HashMap;

public class MapsEx {

	public static void main(String[] args) {
		HashMap<String, String> li = new HashMap<String, String>();
		
		li.put("a", "apple");
		li.put("o", "Orange");
		li.put("b", "Banana");
		

		System.out.print(li.get("o"));

	}

}
