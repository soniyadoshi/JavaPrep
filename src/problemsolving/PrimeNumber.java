package problemsolving;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer num = 77;
		
		for(int i=2; i<num; i++)
		{
			if(num%i ==0)
			{
				System.out.println("number is not prime. it is divisible by" + i);
				return;
			}
		}
System.out.println("number is prime");
	}

}
