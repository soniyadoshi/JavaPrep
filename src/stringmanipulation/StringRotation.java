package stringmanipulation;

public class StringRotation {
	
	/*
	 * Identify if String is rotation of other string eg 'bcda' is roatation of 'abcd' 
	 * but 'dcab' is not rotation of 'abcd'
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String temp ="abcd";
		String rot = "bcda";
		
		String toChk = temp.concat(temp);		
		
		if(toChk.contains(rot))
		{
			System.out.println("Rotation it is..");
		}
		
		findRotation();

	}
	
	public static void findRotation()
	{
		String input ="abcd";
		String rot = "bcda";
		
		if(input.length() != rot.length())
		{
			System.out.println("Not Rotation");
		}else {
			
			if(input.equals(rot))
			{
				System.out.println("Rotation");
			}
			

         //Take the first string's first character and find the index in the second string
			int index = rot.indexOf(input.charAt(0));
			
			if(index > -1)
			{
				//Subtract the length of the rotated string with the index found to find the final position
				int finalPos = rot.length()-index;
				
				//Check if the first character of the rotated String is same as the character at the final position of input String and the input.substring(finalPos) is equal to the rotated.substring(0, index)
				if(input.charAt(finalPos)==rot.charAt(0) && input.substring(finalPos).equals( rot.substring(0,index)))
				{
					System.out.println("Rotation");
				}
			}
			
		}
		
		
		
	}

}
