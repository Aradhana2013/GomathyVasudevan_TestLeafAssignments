package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		// 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37

		String primenum = "";
		for (int i = 2; i <= 100; i++) {
			int num = 0;
			
			for (int j = 2; j < i; j++) {
				if(i%j==0) {
					num = 1;
					break;
				}
				
			}
			if (num==0) {
				primenum=primenum+i+" ";
			}
		}
System.out.println("Prime numbers upto 100 are given below ");
System.out.println(primenum);
	}

}