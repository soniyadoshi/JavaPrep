package problemsolving;

public class FibonacciNth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int prev1 =1;
		int prev2 = 1;
		
		int n = 5;
		
		System.out.println(prev1);
		System.out.println(prev2);
		for(int i=0; i<n-2; i++)
		{
			int num = prev1 + prev2;
			System.out.println(num);
			prev1=prev2;
			prev2 = num;
		}

	}

}
