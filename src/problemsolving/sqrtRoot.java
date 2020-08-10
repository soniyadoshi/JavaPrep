package problemsolving;

public class sqrtRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(sqrt(16));
	}
	
	public static double sqrt(int number) {
		double t;
	 
		double squareRoot = number / 2;
	 
		do {
			t = squareRoot;
			squareRoot = (t + (number / t)) / 2;
		} while ((t - squareRoot) != 0);
	 
		return squareRoot;
	}

}
