package part2;

public class ConstructorOverloading {
	
	ConstructorOverloading(int a, int b){
		System.out.println(a +b);
	}

	ConstructorOverloading(int a, double b){
		System.out.println(a + b);
	}
	
	ConstructorOverloading(int a, int b, int c){
		System.out.println(a + b + c);
	}
	
	public static void main(String[] args) {

		//ConstructorOverloading co = new ConstructorOverloading(100, 200);
		//ConstructorOverloading co = new ConstructorOverloading(1000, 200, 300);
		//ConstructorOverloading co = new ConstructorOverloading(100, 10.5);
		ConstructorOverloading co = new ConstructorOverloading(1000, 200, 300);

	}

}
