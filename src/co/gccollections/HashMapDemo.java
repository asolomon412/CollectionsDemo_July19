package co.gccollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		// Maps are very efficient when retrieving data from memory
		Map<String, Double> items = new HashMap<>();
		items.put("Computer", 2000.01);
		items.put("Ipad", 599.99);
		items.put("Calculator", 29.99);
		items.put("Google Home", 99.99);

		System.out.println(items);

		// HashMaps can't have duplicate keys
		// so if you attempt to add again with a different value
		// the old value will be overwritten(replaced) with the new value
		items.put("Calculator", 597.99);

		System.out.println(items);

		System.out.println(items.get("Ipad"));
		System.out.println(items.containsValue(99.99));
		System.out.println(items.containsKey("Google Home"));

		// we need to use the Map.Entry interface to loop through the items in
		// the HashMap
		for (Map.Entry<String, Double> me : items.entrySet()) {
			System.out.println("Key: " + me.getKey() + " Value: " + me.getValue());
		}
		
		// here is an alternate way to loop through a HashMap using the keys
		for (String s: items.keySet()) {
			System.out.println(s + " " +items.get(s));
		}

		// Maps can contain complex values
		HashMap<String, List<String>> classes = new HashMap<>();
		classes.put("Java", new ArrayList<>());
		classes.get("Java").add("Gerard");
		classes.get("Java").add("Hannah");
		classes.get("Java").add("Ankica");
		System.out.println(classes.get("Java"));
		
		classes.put("Front-end", new LinkedList<>());
		classes.get("Front-end").add("Baraa");
		classes.get("Front-end").add("Mickey");
		classes.get("Front-end").add("Suzy");
		classes.get("Front-end").add("Mary");
		
		System.out.println(classes);
	}

}
