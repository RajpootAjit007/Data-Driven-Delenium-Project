package Java_program;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class array_list001 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		System.out.println(list);
		System.out.println(list.size());
		//how to add the value in arraylist
		list.add("ajit");
		list.add("ajit");
		list.add(12);
		list.add(12.23);
		System.out.println(list);
		System.out.println(list.size());
		//how to fetch the data from arraylist.
		System.out.println(list.get(0));
		System.out.println(list.get(3));
		//how to remove the data from arraylist.
		list.remove(3);
		System.out.println(list);
		System.out.println(list.size());
		//fetch the data via for loop or for each loop
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		//for each loop
		for(Object var:list)
		{
			System.out.println(var);
		}
		// Via Itrator
		Iterator itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		//Generic of List
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(10);
		list1.add(null);
		int i=list1.get(0);
		System.out.println(i);
		

	}

}
