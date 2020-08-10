package problemsolving;

public class OddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] oddNums = findOddNumbers(1,9);
		
		for(int i : oddNums)
		{
			System.out.println(i);
		}

	}
	
	public static int[] findOddNumbers(int l, int r)
	{
		int j=0;
        for(int i=l; i<=r; i++)
        {
            if(i%2 !=0)
            {      
                j++;
            }
        }
        int oddNumbers[] = new int [j];
        int k=0;
        for(int i=l; i<=r; i++)
        {
            if(i%2 !=0)
            {                
                oddNumbers[k] =i;
                k++;
            }
        }
        
		return oddNumbers;
	}

}
