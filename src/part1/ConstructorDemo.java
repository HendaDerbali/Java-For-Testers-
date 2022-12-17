package part1;

public class ConstructorDemo {
	
	int x;
	int y;
	
	// Default constructor
	ConstructorDemo(){
		x = 10;
		y = 20;
		
	}
	
	// Parameterized constructor
	ConstructorDemo(int a, int b){
		x = a;
		y = b;
	}
	
	void display() {
		System.out.println(x + y);
	}

	public static void main(String[] args) {

		ConstructorDemo cd1 = new ConstructorDemo(); // Invoke default constructor
		cd1.display();
		
		ConstructorDemo cd2 = new ConstructorDemo(100, 200); // Invoke parameterized constructor
		cd2.display();

	}

}
