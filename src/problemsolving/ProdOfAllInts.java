package problemsolving;

/*
 * You have an array of integers, and for each index you want to find the product of 
 * every integer except the integer at that index.
 */

public class ProdOfAllInts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,6,4};
		
		//2*6*5*9
		//1*6*5*9
		//1*2*5*9
		//1*2*6*9
		//1*2*6*5
		
		//before and after index
		
		int finalArr[] = new int[arr.length];
		int prodSofar = 1;		
		
		for(int i=0; i<arr.length ;i++)
		{
			finalArr[i] = prodSofar;
			prodSofar *= arr[i];
		}
		
		prodSofar = 1;
		
		for(int i= arr.length-1; i>=0; i--)
		{
			finalArr[i] *= prodSofar;
			prodSofar *= arr[i];
		}
		
		for(int i : finalArr)
		{
			System.out.println(i);
		}
		
	}

}
