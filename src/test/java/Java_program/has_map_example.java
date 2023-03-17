package Java_program;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class has_map_example {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		map.put("firstname", "tiwari");
		map.put("lastname", "mishra");
		map.put("address", "ramgarh");
		System.out.println(map.size());
		System.out.println(map.get("firstname"));
		Set<String> keys = map.keySet();
		for(String key:keys)
		{
			System.out.println(key+" "+map.get(key));
		}
		Map<String,List<String>> map1 = new HashMap<String,List<String>>();
		List<String> list = new ArrayList<String>();
		list.add("rajpootajit007@gmail.com");
		list.add("ajit1090@gmail.com");
		list.add("akash.ss@gmail.com");
		for(int i=0;i<list.size();i++)
		{
		System.out.println(list.get(i));

	}

}
}
