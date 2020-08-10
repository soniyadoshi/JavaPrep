package problemsolving;

/*
 * best case complexity o(1)
 * worst case complexity o(log n)
 */
public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int elements[] = {2,5,8,12,16,23,38,56,72,91};
		int given = 23;
		
		int start =0;		
		int end = elements.length-1;
		
		int mid =0;
		
		while(end >=start)
		{
			mid = (start+end)/2;
			
			if(given == elements[mid])
			{
			  System.out.println("***"+mid);
			}
			
			if(given<elements[mid])
			{
				end = mid-1;			
			}else {
				start= mid+1;			
			}
		}
	}

}
