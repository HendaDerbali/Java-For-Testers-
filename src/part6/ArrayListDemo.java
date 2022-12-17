package part6;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
//		- How to declare array list
		//ArrayList list = new ArrayList(); // We can store any type of element (String / Integer)
		//ArrayList <Integer> list = new ArrayList<Integer>(); // Store Integer elements
		
		ArrayList <String> list = new ArrayList<String>();
		
//		- How to add elements / values to array list
		
		list.add("Khouloud"); //0
		list.add("Emna"); //1
		list.add("Amir");
		list.add("Oussema");
		list.add("Nesrine");
	
		// list.add(100); //Number
		// list.add('A'); // Char
		
		//Print all the values
		System.out.println(list);
		
//		- Find size of array list
		System.out.println(list.size());
		System.out.println("Before removing element: " +list);

//		- Remove elements / values from array list
		list.remove(0);
		System.out.println("After removing element: " +list);
		
//		- Insert a new element in the middle of array list	
		list.add(3, "Anouar");
		System.out.println("After insert element: " +list);
		
//		- Read values from array list
//		for(String s : list) {
//			System.out.println(s);
//		}
		
		// Object we can store any type of value
		for( Object s : list) {
		System.out.println(s);
	}
		

	}

}
