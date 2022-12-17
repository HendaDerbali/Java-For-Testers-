package myPackage;

public class Operators {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		
		// Arithmetic operators --> + - * %
		System.out.println("------------------- Arithmetic operators ---------------------------");
		System.out.println("Sum of a and b is: " +(a+b));
		System.out.println("Diff of a and b is: " +(a-b)); // without () will do concat
		
		// Relational Operators --> == <> <= >= !=
		System.out.println("------------------- Relational operators ---------------------------");
		System.out.println(a == b);
		System.out.println(a > b);
		System.out.println(a != b);
		
		// Logical operators && || !
		//works between two boolean
		boolean x = true; //1
		boolean y = false; //0
//		System.out.println("------------------- Logical operators ---------------------------");
		System.out.println(x && y); //false
		System.out.println(x || y); //true
		System.out.println(!x); //false
		System.out.println(!y); //true
		
		// Increment / Decrement operators ++ --
		System.out.println("------------------- Increment / Decrement operators ---------------------------");
		a = 10;
		//a ++;
		//a = a+1;
//		a = +a;
		System.out.println(a);
		
		b = 20;
		b --; // b = b-1;
		System.out.println(b);
	}

}
