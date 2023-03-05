package week1.day1;

public class LearnJumpStatementContinue {
	public static void main(String[] args) {
		for (int i = 10	; i >= 1; i--) {
			if (i==7) {
				System.out.println("Seven");
				continue;
			}
			System.out.println(i);
		}
		System.out.println("Done");
	}
}
