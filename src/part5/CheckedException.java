package part5;

public class CheckedException {

	public static void main(String[] args) {
		
		System.out.println("Program is started");
		System.out.println("Program is in progress");
		
		// by using keyword - throws InterruptedException
	//	Thread.sleep(3000);
		
		
		// by using try - catch
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Program is compiled");
		System.out.println("Program is exited");

	}

}
