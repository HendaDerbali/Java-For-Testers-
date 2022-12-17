package accessModifiers2;

import pack3.ABC;


   // protected  // Compile time error
//public class Sample extends ABC {
//
//	public static void main(String[] args) {
//		Sample s = new Sample();
//		s.data = 10;
//		s.m1();
//
//	}


public class Sample{

	public static void main(String[] args) {
		ABC s = new ABC();
		s.data = 10;
		s.m1();

	}

}
