package conditionnalStatements;

public class JumpingStatements {

	public static void main(String[] args) {

		for(int i=1; i<=10; i++) {
			if(i == 5) {
				//break;
				continue;
			}
			System.out.println(i);
		}

	}

}
