package problemsolving;

//fibonacci series for first 20 numbers
//1 1 2 3 5 8 13 21 34..
public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int prev1 = 1;
		int prev2 = 1;

		System.out.println(prev1);
		System.out.println(prev2);
		for(int i=2; i<=18; i++)
		{

			int num = prev1 + prev2;
			System.out.println(num);
			prev1 = prev2;
			prev2 = num;
					
		}
		System.out.println("***********************************");
		three();

	}
	
	private static void three() {
		
		int p1 = 1;
		int p2 = 1;
		int p3 = 1;
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		for (int i=3; i< 10; i++) {
			int num = p1+p2+p3;
			System.out.println(num);
			p1 = p2;
			p2 = p3;
			p3 = num;
		}
		
	}

}
