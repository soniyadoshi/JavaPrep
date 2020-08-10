package problemsolving;

import java.util.Scanner;

public class pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  System.out.println("number of rows");
	  Scanner scanner = new Scanner(System.in);
	  int num = scanner.nextInt();
	  
	  for(int row=1; row<=num; row++)
	  {
		  for(int sp=1; sp<=num-row; sp++)
		  {
			  System.out.print(" ");
		  }
			  for(int count = 1; count<=(row*2)-1; count++)
			  {
				  System.out.print("*");
			  }
		  
		  System.out.println();
	  }

	}

}

