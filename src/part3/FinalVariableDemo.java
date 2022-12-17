package part3;

public class FinalVariableDemo {
	
	//without final we can change variable
	final int speed  = 50; // final variable - we cannot change this value

	public static void main(String[] args) {

		FinalVariableDemo fvd = new FinalVariableDemo();
	    fvd.speed = 400; // compile time error because of final
		System.out.println(fvd.speed);
	}

}
