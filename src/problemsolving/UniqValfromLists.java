package problemsolving;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqValfromLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> listOne = new ArrayList<>();
		listOne.add(9);
		listOne.add(3);
		listOne.add(5);
		listOne.add(1);
		listOne.add(14);
		
		List<Integer> listTwo = new ArrayList<>();
		listTwo.add(11);
		listTwo.add(3);
		listTwo.add(5);
		listTwo.add(1);
		
		List<Integer> temp = new ArrayList<>();
		temp.addAll(listOne);
		listOne.removeAll(listTwo);
		listTwo.removeAll(temp);				
		
		for(int num : listOne)
		{
			System.out.println("List 1 ::" +num);
		}
			
		for(int num : listTwo)
		{
			System.out.println("List 2 :: "+num);
		}
		
		//2nd approach
		
		List<Integer> combinUniqList = new ArrayList<>();
		combinUniqList.addAll(listOne);
		combinUniqList.addAll(listTwo);
		Set<Integer> uniquNums = new HashSet<>(combinUniqList);
		
		for(int num : uniquNums)
		{
			System.out.println("set approach : " + num);
		}
		

	}

}
