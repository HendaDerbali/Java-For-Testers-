package part1;

public class EmployeeMain {

	public static void main(String[] args) {

		// same package
		// Creating object 1
		Employee emp1 = new Employee();
		emp1.eid = 101;
		emp1.ename = "Amir";
		emp1.sal = 80.00;
		emp1.job = "Test automation";
		emp1.deptno = 15;
		emp1.display();

		// Creating object 2
		Employee emp2 = new Employee();
		emp2.eid = 102;
		emp2.ename = "Oussema";
		emp2.sal = 90.00;
		emp2.job = "Test API";
		emp2.deptno = 150;
		emp2.display();

	}

}
