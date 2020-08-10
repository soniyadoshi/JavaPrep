package problemsolving;

public class FirstTwoLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numbers[] = {3,44,15,2 ,18,90,45,10};
		find2largest(numbers);
	}
	
	public static void find2largest(int[] numbers)
	{
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		
		for(int i = 0; i <numbers.length; i++)
		{
			if(numbers[i] > first)
			{				
				second = first;
				first = numbers[i];
			}
			else if(numbers[i] > second)
			{
				second = numbers[i];
			}
		}
		
		System.out.println("first ::"+ first +" second::" + second);
		
	}

}
