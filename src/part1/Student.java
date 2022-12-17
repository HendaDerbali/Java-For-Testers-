package part1;

public class Student {
	
	int sid;
	String sname;
	char grade;
	
	// Assign values to variables by using method
//	void getValues(int id, String name, char g) {
//		sid = id;
//		sname = name;
//		grade = g;
//	}
//	
	// Assign values to variables by using constructor
	Student(int id, String name, char g){
		sid = id;
		sname = name;
		grade = g;
	}
	
	void display() {
		System.out.println(sid+" "+sname+" "+grade);
	}

}
