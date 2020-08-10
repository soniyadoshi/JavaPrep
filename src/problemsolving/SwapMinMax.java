package problemsolving;

//swap only min and max from given array
public class SwapMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arry[] = {20,17,2,16,40};
		int max = arry[0];
		int min = arry[0];
		int minIndex=0;
		int maxIndex =0;
		
		for(int i=0; i<arry.length;i++)
		{
			if (arry[i] > max) {
				max = arry[i];
				maxIndex=i;
			}
			if (arry[i] < min) {
				min = arry[i];
				minIndex=i;
			}		
		}
		
		System.out.println(max + " :: "+ min);
	
		int temp = arry[minIndex];
		arry[minIndex] = arry[maxIndex];
		arry[maxIndex] = temp;
		
		for(int n :arry)
		{
			System.out.println(n);
		}

	}

}
