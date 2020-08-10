package problemsolving;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

/*
 * Your company built an in-house calendar tool called HiCal. 
 * You want to add a feature to see the times in a day when everyone is available.
 */
public class CompanyCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Map<Integer, Integer> map = new TreeMap<>();
		map.put(1, 2);
		map.put(2,3);
		map.put(4, 6);
		
		
		Iterator<Entry<Integer, Integer>> it = map.entrySet().iterator();
		
		Map<Integer, Integer> res = new HashMap<>();
		
		Entry<Integer, Integer> et = it.next();
		int start = et.getKey();
		int end = et.getValue();
		
		while(it.hasNext())
		{
			et = it.next();
			int startTime = et.getKey();
			int endTime = et.getValue();
			
			if(end <startTime)
			{
				res.put(end, startTime);
				
			}
			start = startTime;
			end = endTime;
			
		}
		
		if(res.isEmpty())
		{
			System.out.println(" free after "+ end);
		}else {

			System.out.println(res.toString());
		}
		
		
		
	}
}
