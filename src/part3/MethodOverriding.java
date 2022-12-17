package part3;

class Bank{
	
	// same name
	 double interestRate() {
		 return 0;
	 }
}


class SBI extends Bank{
	
	// same name
	double interestRate() {
		return 10.5; // different body
	}
	
}

class ICICI extends Bank{
	double interestRate(){
		return 9.5;
	}
	
}

class AXIS extends Bank{
	double interestRate() {
		return 8.5;
	}
}





public class MethodOverriding {

	public static void main(String[] args) {
		
		SBI sbi = new SBI();
		System.out.println(sbi.interestRate());
		
		ICICI icici = new ICICI();
		System.out.println(icici.interestRate());
		
		AXIS axis = new AXIS();
		System.out.println(axis.interestRate());

	}

}
