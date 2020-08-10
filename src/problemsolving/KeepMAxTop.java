package problemsolving;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class KeepMAxTop {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		Integer arry [] = {4,2,3,1,5,8,7,6};
		keepTopMax(arry);
		usingQueue(arry);

	}
	
	public static void keepTopMax(Integer [] arry) {
		TreeSet<Integer> set = new TreeSet<>();
	 for (Integer i : arry) {
		 if (set.size() < 5) {
			 set.add(i);
		 } else {
			 if (set.first() < i) {
				 set.pollFirst();
				 set.add(i);
			 }
		 }
	 }
	 System.out.println(set.toString());
	}
	
	public static void usingQueue (Integer [] arry) {
		PriorityQueue<Integer> queue = new PriorityQueue<>(5,Collections.reverseOrder());
		queue.addAll(Arrays.asList(arry));
		Integer val = null;
		while( (val = queue.poll()) != null) {
		    System.out.println(val);
		}
	}
}
