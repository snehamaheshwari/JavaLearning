import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.text.html.HTMLDocument.Iterator;

public class HashMapDemo {

	public static void main(String [] args) {
		HashMap<Integer, String> Hmap = new HashMap<Integer, String>();
		Hmap.put(1, "One");
		Hmap.put(2, "two");
		Hmap.put(3, "Three");
		Hmap.put(4, "four");
		
		System.out.println(Hmap.size());
		System.out.println(Hmap.get(2));
		
		for(Map.Entry<Integer, String> entry : Hmap.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			
			System.out.println(key + " : " + value);
		}
		
		// Q.5 Write a Java Program to count the number of words in a string using HashMap.
		 String str = "This this is is done by Sneha Sneha";
	        String[] split = str.split(" ");
	        HashMap<String,Integer> map = new HashMap<String,Integer>();
	        System.out.println(split.length);
	        System.out.println(split[0]);
	        for (int i=0; i<split.length; i++) {
	            if (map.containsKey(split[i])) {
	                int count = map.get(split[i]);
	                map.put(split[i], count+1);
	            }
	            else {
	                map.put(split[i], 1);
	            }
	        }
	        System.out.println(map);
	        
	    // Q #6) Write a Java Program to iterate HashMap using While and advance for loop.
	        HashMap<Integer,String> map2 = new HashMap<Integer,String>();
	        map2.put(2, "Sneha");
	        map2.put(25, "Maheshwari");
	        map2.put(12, "HashMap");
	        System.out.println(map2.size());
	        System.out.println("While Loop:");
	        java.util.Iterator<Entry<Integer, String>> itr = map2.entrySet().iterator();
	        while(itr.hasNext()) {
	            Map.Entry me = (Map.Entry) itr.next();
	            System.out.println("Key is " + me.getKey() + " Value is " + me.getValue());
	        }
	        System.out.println("For Loop:");
	        for(Map.Entry me2: map2.entrySet()) {
	            System.out.println("Key is: " + me2.getKey() + " Value is: " + me2.getValue());
	        }
	}
}
