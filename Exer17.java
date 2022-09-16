package conditionsss;

public class Exer17 { 
	public static void main(String[] args) {
		long a = 6000l;
		if (a>=0 && a<100) {
			System.out.println("No Balance");
		}
		else if (a>=100 && a<5000) {
			System.out.println("LOw Balance");
		}
		else if (a>=5000 && a<100000) {
			System.out.println("Sufficient Balance");
		}
		else {
			System.out.println("Had Enough");
		}
	}

}
