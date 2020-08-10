package problemsolving;

public class SortZerosOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arry[] = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
		
		for(int i=0; i<arry.length;i++)
		{
			for(int j=0; j<arry.length-1; j++)
			{
			
				if(arry[j] > arry[j+1])
				{
					int temp = arry[j];
					arry[j]= arry[j+1];
					arry[j+1]=temp;
				}
			}
		}
		
		for(int t :arry)
		{
			System.out.println(t);
		}

	}

}
