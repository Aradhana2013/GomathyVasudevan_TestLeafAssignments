package week1.day1;

public class LearnJumpStatementBreak {

	public static void main(String[] args) {
		for (int i = 10; i >= 1; i--) {
			
			if (i==7) {
				System.out.println("Seven");
				break;
			}
			System.out.println(i);
			
		}
		System.out.println("Out of loop");

	}

}
