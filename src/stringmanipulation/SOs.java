package stringmanipulation;

public class SOs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "SOSSPSSQSSOR";
		int count = marsExploration(input);
		System.out.println(count);

	}
	
	static int marsExploration(String s) {
        // Complete this function
        if(s == null)
        {
            return 0;
        }
        int count =0;
        String word = "SOS";
        
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i) != word.charAt(i%3))
            {
                count++;
            }
        }
        return count;
	}

}
