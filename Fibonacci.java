package week1.day1;

public class Fibonacci {

	public static void main(String[] args) {
		int firnum = 0;
		int secnum = 1;
		int sum = 0;
		System.out.println(firnum);
		System.out.println(secnum);
		for (int i = 1; i <= 11; i++) {

			sum = firnum + secnum;
			System.out.println(sum);
			firnum = secnum;
			secnum = sum;
		}

	}

}



