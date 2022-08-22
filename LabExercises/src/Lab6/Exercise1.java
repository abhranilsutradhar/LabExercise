package Lab6;

import java.util.*;
import java.util.Map.Entry;

public class Exercise1 {
	 static List getValues(HashMap <String,String> map) {
		List<String> list = new ArrayList<>();
		for (String s : map.values()){
			list.add(s);
		}
			Collections.sort(list);  
			return list;
	}
	public static void main(String args[]) {
		HashMap <String,String> map = new HashMap <String,String>();
		map.put("a", "b");
		map.put("z", "b");
		map.put("e", "k");
		map.put("d", "j");
		getValues(map);
		Set<Entry<String, String>>entries =map.entrySet();
		for(Entry<String, String> entry : entries)
			System.out.println(entry.getKey()+"\t"+entry.getValue());
	}
}