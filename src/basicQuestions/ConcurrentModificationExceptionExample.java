package basicQuestions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentModificationExceptionExample {
	public static void main(String[] args) {

		// HashMap
		Map<String, String> myMap = new HashMap<String, String>();
		myMap.put("1", "valu1");
		myMap.put("2", "valu2");
		myMap.put("3", "valu3");
		myMap.put("4", "valu4");
		myMap.put("5", "valu5");

		System.out.println("HashMap before iterator: " + myMap);
		Iterator<String> it1 = myMap.keySet().iterator();

		while (it1.hasNext()) {
			String key = it1.next();
			if (key.equals("3")) {
				myMap.put("newKey", "newValue");
			}
		}
		System.out.println("HashMap after iterator: " + myMap);
		
		

		// ConcurrentHashMap
		/*Map<String, String> myMap = new ConcurrentHashMap<String, String>();
		myMap.put("1", "1");
		myMap.put("2", "1");
		myMap.put("3", "1");
		myMap.put("4", "1");
		myMap.put("5", "1");
		System.out.println("ConcurrentHashMap before iterator: " + myMap);
		
		Iterator<String> it = myMap.keySet().iterator();
		
		while (it.hasNext()) {
			String key = it.next();
			if (key.equals("3")) {
				myMap.put("newKey", "newValue");
			}
			
			System.out.println("ConcurrentHashMap after iterator: " + key);
		}*/
		
	}
}
