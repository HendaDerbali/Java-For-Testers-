package part2;

public class StaticExamples {
	
	static int a = 10; // static variable
    int b = 20; // non static variable
	
	static void m1() {
		System.out.println("This is m1 - static method");
		
		// Access to variable b directly - non access
		// Create object
		StaticExamples se = new StaticExamples();
		System.out.println(se.b);
		System.out.println(a);
	}
	
	void m2() {
		System.out.println("This is m2 - non static method");
	}
	
	void m3() {
		System.out.println("This is m3 - non static method");
		System.out.println(a);
		System.out.println(b);
		
		m1();
		m2();
		
	}
	

	public static void main(String[] args) {
		
		// static method can access only static stuff(directly) without an object
		System.out.println(a);
		
		m1();
		
		// System.out.println(b); incorrect because b is non static variable
		// m2(); incorrect because m2 is non static variable
		
		StaticExamples se = new StaticExamples();
		System.out.println(se.b);
		se.m2();
		se.m3();
	}

}
