package problemsolving;

import java.util.Arrays;

// Print sum of products of max numbers from 2 arrays

public class MaxSumOfProds {

	public static void main(String args[])
	{
		int arrayA[] = {5,1,3,4,2};
		Integer arrayB[] = {8,10,9,7,6};
		
		Arrays.sort(arrayA);
		Arrays.sort(arrayB);
		//Arrays.sort(arrayB, Collections.reverseOrder());
		
		int bLen = arrayB.length-1;		
		Integer sum = 0;		
		for(int ai=0; ai<arrayA.length; ai++)
		{
			//for(int bi=bLen-ai; bi>=0; bi--)
			for(int bi=0; bi<arrayB.length;bi++)
			{
				if(ai == bi)
				{
				System.out.println(arrayA[ai]+ " * "+arrayB[bi]);
				//System.out.println(ai+ " * "+bi);
				sum = sum+(arrayA[ai]*arrayB[bi]);
				break;
				}
			}
		}
		
		System.out.println(" Total Sum :: "+sum);
		System.out.println(Integer.MIN_VALUE);
		
	}
}
