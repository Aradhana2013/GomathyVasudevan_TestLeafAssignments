package week1.day1;

public class LearnSwitchCase {

	public static void main(String[] args) {
		String browsertype = "IE";

		switch (browsertype) {
		case "Chrome": System.out.println("Open Chrome browser"); break;
		case "Edge": System.out.println("Open Edge browser");break;
		case "Safari": System.out.println("Open Safari browser");break;
		case "Opera": System.out.println("Open Opera browser");break;
		case "Firefox": System.out.println("Open Firefox browser");break;
		default : System.out.println("Nothing");
		}
	
	}

}
