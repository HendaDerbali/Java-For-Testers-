package part6;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		
//		- Declare HashMap
		//HashMap hm = new HashMap(); // Declaration 1
		HashMap <Integer, String> hm = new HashMap<Integer, String>();
		
//		- Add element to Hashmap
		hm.put(101, "Saoussen");
		hm.put(102, "Amal");
		hm.put(103, "Rahma");
		hm.put(104, "Henda");
		hm.put(105, "Yosra");
		
		System.out.println(hm);
		
//		- Remove element from Hashmap
		hm.remove(103); // remove by key number
		System.out.println("After removing a pair: " +hm);
		
//		- Read pairs for Hashmap using enhanced for loop
		for(Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " +m.getValue() );
		}



	}

}
