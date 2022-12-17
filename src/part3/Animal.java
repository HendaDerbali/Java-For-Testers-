package part3;

//1
public class Animal {
	
	String color = "White";
	
	//2
	void eating() {
		System.out.println("Eating.................");
	}
	
	//3
	Animal(){
		System.out.println("Animal is created");
	}

}


class Dog extends Animal{
	
	//we can also call this overriding - different body
	String color = "Black";
	
	Dog(){ //Constructor
		super();
		System.out.println("Dog is created");
	}
	
	void displayColor() {
		System.out.println(color);
		System.out.println(super.color);//when add super - in test super we print Black and white
	}
	
	void eating() {
		System.out.println("Eating bread .............");
		super.eating();
	}
	
}
