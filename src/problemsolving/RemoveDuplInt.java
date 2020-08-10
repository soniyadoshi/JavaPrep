package problemsolving;

public class RemoveDuplInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {1,2,3,4,3,5};
        int i = removeDuplicates(array);
        System.out.println(i);
	}
	
	 public static int removeDuplicates(int[] nums) {
	        
	        if (nums ==  null || nums.length == 0)
	        {
	            return 0;
	        }
	        
	        int j=0;
	        
	        for(int i=0; i<nums.length-1;i++)
	        {
	            if(nums[i] != nums[i+1])
	            {
	                nums[j++]=nums[i];
	                
	            }
	        }
	        nums[j++]=nums[nums.length-1];
	              
	        return j;
	    }

}
