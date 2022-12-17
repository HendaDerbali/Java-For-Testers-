package part4;


interface ABC{
	int x = 120;
	void m1();
}

interface XYZ{

	int y = 250;
	void m2();
}


public class MultipleInheritance implements ABC, XYZ {

	public void m1() {
		System.out.println(x);
	}

	public void m2() {
		System.out.println(y);
	}
	public static void main(String[] args) {
		MultipleInheritance test = new MultipleInheritance();
		test.m1();
		test.m2();
	}

}
