package problemsolving;

/*
 * best case and worst case complexity O(n2)
 */
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] = {23,43,98,10,5,8};
		
		bubbleSort(array);

	}
	
	public static void bubbleSort(int[] array)
	{
		int size = array.length;
		
		for(int i=0; i<size; i++)
		{
			for(int j=0; j<size-i-1; j++)
			{
				if(array[j] > array[j+1])
				{
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1]= temp;
				}
			}
		}
		
		for(int num : array)
		{
			System.out.println("sorted :: "+num);
		}
		
	}

}
