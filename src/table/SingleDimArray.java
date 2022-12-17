package table;

public class SingleDimArray {

	public static void main(String[] args) {

//		int a[] = new int[5]; // Declare array with size 5, starting index is 0, last index is 4
//
//		// Storing // inserting values into array
//		a[0] = 100;
//		a[1] = 200;
//		a[2] = 300;
//		a[3] = 400;
//		a[4] = 500;
		
		
		// Declare array without specifying size
		int a [] = {100, 200, 300, 400, 500};
		System.out.println("Length of an array is: " +a.length); //Print length / size of array
		
		// Read specific value
		System.out.println(a[2]); // 300
		
//		for(int i=0; i<a.length; i++) {
//			System.out.println(a[i]);
//		}
		
		
		//Read values using enhanced for loop
		for(int i : a) {
			System.out.println(i);
		}

	}

}
