package problemsolving;

public class alphabetPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch = 'b';
		
		if(ch >='a' && ch <= 'z')
		{
		 ch = (char) (ch -32);
		}
		
		System.out.println(ch);
		
		char r = 'A';
		
		int sp = ch -r;
		
		System.out.println(sp);
		
		for(char let = 'a'; let<='z'; let ++)
		{
			System.out.println(let);
		}

	}

}
