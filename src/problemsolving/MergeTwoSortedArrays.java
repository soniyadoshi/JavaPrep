package problemsolving;

/*
 * given 2 sorted arrays merge into 1 sorted array
 */
public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,2,5,6,8};
		int b[] = {3,4,9};
		
		int c[] = merge(a,b);
		
		for(int i: c)
		{
			System.out.println(i);
		}

	}
	
	private static int[] merge(int a[], int b[]) {
		
		int c[] = null;
		if(a != null && b!= null)
		{
			c = new int [a.length + b.length];
			int aIndex = 0;
			int bIndex = 0;
			int cIndex = 0;
			
			
			while(cIndex < c.length)
			{	

				boolean aExhausted = aIndex >= a.length;
				boolean bExhausted = bIndex >= b.length;
				
				/*
				 * Edge cases
				 * 1) if one array is longer that other
				 * 2) both input elements are 0 or 1 elements
				 * 3) one of the array runs out of elements before we done merging
				 * 
				 * if a is Exhausted always increment b
				 * if b is Exhausted always increment a
				 */
				if((!aExhausted) && (bExhausted || a[aIndex] < b[bIndex]))
				{
					c[cIndex] = a[aIndex];
					aIndex++;
				}else
				{
					c[cIndex] = b[bIndex];
					bIndex++;
				}
				cIndex++;
			}
		}
		
		return c;
		
	}

}
