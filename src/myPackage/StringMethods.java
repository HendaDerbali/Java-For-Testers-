package myPackage;

public class StringMethods {

	public static void main(String[] args) {
		
		String s = "welcome";
		String s1 = "to java";
		
		//Length of a string
		System.out.println(s.length());
		
		//Joining of a string
		System.out.println(s.concat(s1));
		
		//Trimming the string
		s = "             welcome        ";
		System.out.println("Before trimming string is: " +s);
		
		//Remove space
		System.out.println("After trimming string is: " +s.trim());
		
		//ChartAt()
		s = "welcome";
		System.out.println(s.charAt(4));
		
		//Contains() ==> return true
		System.out.println(s.contains("wel"));
		System.out.println(s.contains("com"));
		
		//Comparing string equals()
		s = "welcome";
		System.out.println(s.equals("welcome"));
		System.out.println(s.equals("Welcome"));
		System.out.println(s.equals("wel  come"));
		
		//Replacing characters
		s = "welcome to java";
		System.out.println(s.replace('o', 'i'));
		System.out.println(s.replace("java", "selenium"));
		
		//Extracting substring from the main string
		s = "welcome";
		System.out.println(s.substring(0, 4));
		
		//Converting case
		s = "WELCOME";
		System.out.println(s.toLowerCase());
		
		s = "welcome";
		System.out.println(s.toUpperCase());
		
	}  

}
