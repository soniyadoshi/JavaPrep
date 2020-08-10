package problemsolving;

import java.util.Arrays;
import java.util.Collections;

public class TopFiveLargeNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer arry[] = {12,27,65,23,45,10};
		
		Arrays.sort(arry, Collections.reverseOrder());	
		
		for(int i : arry)
		{
	//	System.out.println(i);
		}
		
		//2nd approach
		//topFive();
		topFive2();
		
	}
	
	public static void topFive()
	{
		//int i;
	    int large[] = new int[5];
	    int array[] = { 33, 55, 13, 46, 87, 42, 10, 34, 43, 56 };

	    for (int j = 0; j < array.length; j++) {
	        for (int i = 4; i >= 0; i--) {
	            if (array[j] > large[i]) {
	                if (i == 4) {
	                    large[i] = array[j];
	                }
	                else{
	                    int temp = large[i];
	                    large[i] = array[j];
	                    large[i+1] = temp;
	                }
	            }
	        }
	    }
	    for (int j = 0; j<5; j++)
	    {
	        System.out.println("Largest "+ j + ":"+ large[j]);
	    }
	}
	
	public static void topFive2()
	{
		Integer arry[] = {12,27,65,23,45,10};
		Integer large[] = new Integer[5];
		
		for(int j=0; j<5; j++)
		{
			int index = 0;
			Integer max = arry[0];
			
			for(int i= 0; i<arry.length; i++)
			{
				if(arry[i] > max)
				{
					max = arry[i];
					index = i;
				}
			}
			large[j] = max;
			arry[index]=Integer.MIN_VALUE;
		}
		
		for(int k : large)
		{
			System.out.println(k);
		}
	}
	
}
