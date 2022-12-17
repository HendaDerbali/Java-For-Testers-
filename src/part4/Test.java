package part4;

interface A{
	int a = 20; // by default variables in interface are static and final 
	void m1(); // Abstract method (without implementation of code), by default public
}

class B{
	int b;
}

public class Test extends B implements A{
	
	//Here we implement the method
	public void m1() {
		System.out.println(a);
	}

	public static void main(String[] args) {
		
		//Here we can access to the method
//		Test test = new Test();
//		test.m1();
		
		
		//Another way to invoke m1
		A a = new Test(); // Create memory for the interface, because interface does not have a memory by default
		a.m1();
		

	}

}
