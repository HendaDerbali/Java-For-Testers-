package accessModifiers;


class A{
	
//	private int data = 10;
//	private void m1() {};
	
//	int data = 10;
//	void m1() {
//		
//	}
	
	
	protected int data = 10;
	protected void m1() {
		System.out.println(data);
	}
}

public class Simple {

	public static void main(String[] args) {
		A aobj = new A();
		aobj.data = 20; 
		aobj.m1();

	}

}
