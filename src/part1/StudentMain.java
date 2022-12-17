package part1;

public class StudentMain {

	public static void main(String[] args) {

		// 1 Assign values to variables by using reference variable
		//Student stu1 = new Student(101, "Anouar", 'A');
//		stu1.sid = 1010;
//		stu1.sname = "Khouloud";
//		stu1.grade = 'A';
//		stu1.display();
		
		// 2 Assign values to variables by using method
		//stu1.getValues(101, "Anouar", 'A');
		//stu1.display();
		
		// 3 Assign values to variables by using constructor
		Student stu1 = new Student(1502, "Rahma", 'A');
		
		stu1.display();
		

	}

}
