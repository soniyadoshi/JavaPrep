package problemsolving;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 1534236469;
		int reverse =0;
		
		
		StringBuilder sb = new StringBuilder();
		
		while(num != 0)
		{
			int revDigit = num%10;
			num = num/10;			
		    reverse = reverse*10+revDigit;
		}
		
		System.out.println(reverse);

	}

}
