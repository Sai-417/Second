package conditionsss;

public class Exer22 {
	public static void main(String[] args) {
		String a = args[0].toUpperCase();
		if (a.contains("A")||a.contains("E")||a.contains("I")||a.contains("O")||a.contains("U")) {
			System.out.println("contains");
		}
		else {
			System.out.println("not contains");
		}
	}

}
