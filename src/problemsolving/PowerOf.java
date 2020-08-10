package problemsolving;

public class PowerOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		powerOfTen(1000);
//		powerOfTen(10);
//		powerOfTen(1);
//		powerOfTen(4);
		
		powerOfgiven(10, 1000);
		powerOfgiven(1, 1000);
		powerOfgiven(2, 128);
		powerOfgiven(3, 127);
		powerOfgiven(4, 120);

	}
	
	public static void powerOfTen(int input)
	{
		int pow = 1;
		if(input == 1)
		{
			System.out.println(" power of 1 is "+1);
			return;
		}
		while(pow < input)
		{
			pow = pow * 10;
			
			if(pow == input)
			{
				System.out.println(input +" is power of 10");
				return;
			}
		}
		System.out.println(input+" not power of 10 ");
	}
	
	public static void powerOfgiven(int powerOf, int input)
	{
		if(input == 1 || powerOf == 1)
		{
			System.out.println(" power of 1 is "+1);
			return;
		}
		int pow = 1;
		
		
		while(pow < input)
		{
			pow = pow * powerOf;
			
			if(pow == input)
			{
				System.out.println(input + " is power of "+powerOf);
				return;
			}
		}
		System.out.println(input+" not power of  "+powerOf);
	}

}
