package part1;

public class Calculation {
	
	int x = 10;
	int y = 20;
	
	//1/case - 1: Not taking parameters and also not returned any value
//	void sum() {
//		//body
//		System.out.println(x+y);
//		
//	}
	
	//2/case - 2: Not taking parameters but returning value
	int sum() {
		return(x + y);
	}
	
	//3/case - 3: Tacking parameters but not returning value 
//	void sum(int a, int b) {
//		System.out.println(a + b);
//	}

	//4/case - 4:Tacking parameters and also returning a value
//	int sum(int a, int b) {
//		return a + b;
//	}

	public static void main(String[] args) {
		
		Calculation cal = new Calculation();
		//cal.sum(); //1
		int res = cal.sum(); //2
		System.out.println(res);
		
		//cal.sum(100, 250); //3
		
		//System.out.println(cal.sum(100, 300)); //
		
	}

}
