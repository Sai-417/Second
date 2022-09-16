package conditionsss;

public class Exer18 {
	public static void main(String[] args) {
		int a = 490;
		if (a>=0 && a<300) {
			System.out.println("Failed");
		}
		else if (a>=300 && a<350) {
			System.out.println("C grade");
		}
		else if (a<=350 && a<400) {
			System.out.println("B grade");
		}
		else if (a>=400 && a<450) {
			System.out.println("A grade");
			}
		else if (a>=450 && a<=500) {
			System.out.println("S grade");
		}
		else {
			System.out.println("INvalid");
		}
		}
	}


