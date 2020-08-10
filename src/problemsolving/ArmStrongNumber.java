package problemsolving;

public class ArmStrongNumber {

	/*An Armstrong number is a 3 digit number for which sum of cube 
	 * of its digits is equal to the number itself. 
	 * An example of Armstrong number is 153 as 153= 1+ 125+27
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 153;
		int input = 153;
		int sum = 0;
		int digCnt = 0;
		
		while(num !=0)
		{
			digCnt++;
			num=num/10;
		}
		num = input;
		while(num != 0)
		{
			int digPow = 1;
			int digit = num%10;
			for(int i=0; i<digCnt;i++)
			{
				digPow*=digit;
			}
			sum+=digPow;
			num=num/10;
			
		}
		System.out.println(sum);
		if(input == sum)
		{
			System.out.println("armStrong");
		}

	}

}
