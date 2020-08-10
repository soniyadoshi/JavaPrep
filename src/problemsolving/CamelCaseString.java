package problemsolving;

public class CamelCaseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		camelcase("saveChangesInTheEditor");
	}
	
	static void camelcase(String s) {
        // Complete this function
        if(s == null || s =="")
        {
            return;
        }
        
        String arr[] = s.split("[A-Z]");
        System.out.println(arr.length);
        
    }

}
