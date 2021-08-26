package mapDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ClassGrades {
	Map<String, Integer> map = new HashMap<String, Integer>();

	public ClassGrades() {
		map.put("ABC", 1);
		map.put("XYZ", 2);
		map.put("JKL", 3);
		map.put("MNO", 4);
		map.put("HAR", 5);
	}
	
	public void printMapIterator() {
		Iterator<Map.Entry<String, Integer>> itr = map.entrySet().iterator();
		while(itr.hasNext())
        {
             Map.Entry<String, Integer> entry = itr.next();
             System.out.println("Key = " + entry.getKey() +
                                 ", Value = " + entry.getValue());
        }
		System.out.println("---------------------------");
	}
	
	public void printMapForLoop() {
		for (Map.Entry<String,Integer> entry : map.entrySet()) {
            System.out.println("Key = " + entry.getKey() +
                             ", Value = " + entry.getValue());
    	}
		
		for (String name : map.keySet())
            System.out.println("key: " + name);
         
        for (Integer id : map.values())
            System.out.println("value: " + id);
	}	
}