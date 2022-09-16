package conditionsss;

public class Exer8 {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		if (a%5==0 || a%10==0) {
			System.out.println("they are divisible");
		}
		else {
			System.out.println("they are not divisible");
		}
		
		
	}

}
