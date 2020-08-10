package problemsolving;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		decimalToBinary(7);
		decimalToBinary(10);
		decimalToBinary(33);
		decimalToBinary(25);
		decimalToBinary(7);
	}
	
	public static void decimalToBinary(int n) {
		StringBuilder x = new StringBuilder();
		while (n > 0) {
			int a = n%2;
			n = n/2;
			x.append(a);
		}
		System.out.println(n + " :: " + x.reverse());
		
	}

}
