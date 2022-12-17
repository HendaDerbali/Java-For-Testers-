package part3;


final class Bike1{ //add final - so we cannot extend into child class
	int speed = 500;
	void run() {
		System.out.println(speed);
	}
}

class Honda1 extends Bike1{ // compile time error
	
}

public class FinalClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
