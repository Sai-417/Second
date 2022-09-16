package conditionsss;

public class Exer19 {
	public static void main(String[] args) {
		String a = args[0].toUpperCase();
		if (a.charAt(0)=='B') {
			System.out.println("BRISTOL");
		}
		else if (a.charAt(0)=='C') {
			System.out.println("CARDIFF");
		}
		else if (a.charAt(0)=='F') {
			System.out.println("FJORD");
		}
		else if (a.charAt(0)=='G') {
			System.out.println("GOTHEMBURG");
		}
		else if (a.charAt(0)=='M') {
			System.out.println("MALMO");
		}
		else {
			System.out.println("No Rooms Available");
		}
	}

}
