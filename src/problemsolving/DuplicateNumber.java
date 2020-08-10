package problemsolving;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*
 * for numbers with arithmatic progression and can find only 1 duplicate
 */
public class DuplicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer numbers[] = {1,2,3,4,5,6,4};
		findDupliacte(numbers);
		dupsWithtCollection(numbers);
//		int n = numbers.length;
//		int sum =0;
//		int actualSum = n*(n+1)/2;
//		
//		System.out.println("actualSum"+actualSum);
//		for(int i=0; i<n;i++)
//		{
//			sum+=numbers[i];
//		}
//		
//		System.out.println("sum" + sum);
//		int dupNum = actualSum - sum;
//		
//		System.out.println("duplicate element is" + dupNum);
			
		Set<Integer> set = new HashSet<>();
		for(int i=0; i<numbers.length;i++)
		{
		 if(!set.add(numbers[i]))
		 {
//			 System.out.println(numbers[i]);		 
		 }	
		}

	}
	
	private static void findDupliacte (Integer numbers[]) {
		List<Integer> ls =Arrays.asList(numbers);
		System.out.println(ls.stream().distinct().collect(Collectors.toList()));
	}
	
	private static void dupsWithtCollection (Integer numbers[]) {
		Integer dup = Integer.MAX_VALUE;
		
	}

}
