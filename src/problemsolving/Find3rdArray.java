package problemsolving;

/*given 2 array a ={4,2}, b={3,7}
 *
 *find 3rd array c ={17,7} such that 4/2 + 3/7 = 34/14 = 17/7
 */

public class Find3rdArray {
	
	public static void main(String args[])
	{
		
		int a[] = {4,-8};
		int b[] = {10,20};
		
		int c[] = findC(a,b);
		
		System.out.println(c[0]+" "+ c[1]);
		
	}
	
	public static int[] findC(int a[], int b[])
	{
		int numerator = 0, denominator = 0;
		if(a != null && b != null)
		{
			numerator = (a[0]*b[1])+(a[1]*b[0]);
			denominator = a[1]*b[1];
		}
		
		int gcd = findGCD(numerator, denominator);
		numerator = numerator/gcd;
		denominator = denominator/gcd;
		int c[] = {numerator, denominator};
		
		return c;
	}
	
	private static int findGCD(int a, int b) {
		
		System.out.println(a + " "+ b);
		int gcd = 1;
		for(int i =2; i< a && i < b ; i++)
		{
			if(a % i == 0 && b%i == 0)
			{
				gcd = i;
			}
		}
		System.out.println(gcd);
		return gcd;		
	}
	

}
