package problemsolving;

// print odd factors from given array
// odd factors are 
public class OddFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arry[] = {9,4,6,8,3,36,20,81};
		
		for(int i=0; i<arry.length; i++)
		{
			if(Math.sqrt(arry[i]) % 1 == 0)
			{
				System.out.println(Math.sqrt(arry[i]));
			}
		}      

	}

}
