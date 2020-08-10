package stringmanipulation;

public class CompressString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "abbc";
		
		int len = compressString(input);
		
		if(len > input.length())
		{
			System.out.println(" Original string is smaller "+input);
		}

	}
	
	public static int compressString(String input) {
		
		StringBuilder builder = new StringBuilder();
		
		int count = 1;
		
		char letter = input.charAt(0);
		
		for(int i=1; i<input.length(); i++)
		{
			if(input.charAt(i) == letter)
			{
				count++;
				
			}else
			{
				builder.append(letter);
				builder.append(count);
				count = 1;
				letter = input.charAt(i);				
			}if(i== input.length()-1)
			{
				builder.append(letter);
				builder.append(count);
			}
							
		}
		System.out.println(builder.toString());
		
		return builder.toString().length();
	}

}
