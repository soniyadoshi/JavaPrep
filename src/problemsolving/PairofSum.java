package problemsolving;

public class PairofSum {
	 private static final int MAX = 100000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int A[] = {5, 4, 2, 6, 3, 7, 1};
	        int n = 8;
	        printpairs(A,  n);
	}
	
	static void printpairs(int arr[],int sum)
    {
		
        // Declares and initializes the whole array as false
        boolean[] binmap = new boolean[MAX];
 
        for (int i=0; i<arr.length; ++i)
        {
            int temp = sum-arr[i];
 
            // checking for condition
            if (temp>=0 && binmap[temp])
            {
                System.out.println("Pair with given sum " +
                                    sum + " is (" + arr[i] +
                                    ", "+temp+")");
            }
            binmap[arr[i]] = true;
        }
    }

}
