package problemsolving;

public class TooChaotic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int q [] = {2,1,5,3,4};
		minimumBribes(q);
	}
	
	static void minimumBribes(int[] q) {
        int count = 0;
        int bribe = 0;
     for (int i=0; i< q.length-1; i++) {
         count = q[i+1] - q[i];
         if(count != 1){
             if (count > bribe ) {
                 bribe = count;
             }
         }
     }
        System.out.println(bribe);
    }

}
