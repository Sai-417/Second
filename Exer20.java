package conditionsss;

public class Exer20 {
	public static void main(String[] args) {
		String a = args[0].toUpperCase();
		if (a.startsWith("I") && a.endsWith("A")) {
			System.out.println("INDIA");
		}
		else if (a.startsWith("C") && a.endsWith("A")) {
			System.out.println("CHINA");
		}
		else if (a.startsWith("K") && (a.endsWith("A"))) {
			System.out.println("KOREA");
		}
		else if (a.startsWith("U") && (a.endsWith("E"))) {
			System.out.println("UKRAINE");
		}
		else {
			System.out.println("INVALID");
		}
	}

}
