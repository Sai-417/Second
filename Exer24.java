package conditionsss;

public class Exer24 {
	public static void main(String[] args) {
		String[] a = args[0].split(",");
		if (a[0].length()>a[1].length()||a[0].length()>a[2].length()||a[0].length()>a[3].length()){
			System.out.println("String 1 is bigger");
		}
		else if (a[1].length()>a[0].length()||a[1].length()>a[2].length()||a[1].length()>a[3].length()){
			System.out.println("String 2 is bigger");
		}
		else if (a[2].length()>a[0].length()||a[2].length()>a[1].length()||a[2].length()>a[3].length()){
			System.out.println("String 3 is bigger");
		}
		else {
			System.out.println("String 4 is bigger");
		}
	}

}
