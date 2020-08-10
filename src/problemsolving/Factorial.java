package problemsolving;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact = 1;
		int input = 6;
		for(int i=input; i>1; i--)
		{
			fact *=i; 
		}
		
		System.out.println(fact);
		
		System.out.println(recFact(6));


	}
	
	public static int recFact(int num)
	{
		int fact = 1;
		if(num == 1)
		{
			return 1;
		}
		
		return num*recFact(num-1);
	}

}
