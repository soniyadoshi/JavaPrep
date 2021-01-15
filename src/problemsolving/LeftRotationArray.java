package problemsolving;

public class LeftRotationArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input[] = {-1,-100,3,99};
		int k =2;
		int n = input.length;
		System.out.println(n);
		leftRotate(input, n, k);

	}
	
	private static void leftRotate(int[] input, int n, int k)
	{
		if(n == 0)
		{
			return;
		}
		int mod = k%n;
		System.out.println(" mod "+mod);
		for(int i=0; i<n; i++)
		{		
		System.out.print((input[(i + mod) % n])+" ");
		System.out.println();
		}
	}
	
	static void leftRotate1(int arr[], int n, int k) {
		/*
		 * To get the starting point of rotated array
		 */
		int mod = k % n;

		// Prints the rotated array from
		// start position
		for (int i = 0; i < n; ++i)
			System.out.print(arr[(i + mod) % n] + " ");

		System.out.println();
	}

}
