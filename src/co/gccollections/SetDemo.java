package co.gccollections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		// Sets can't have duplicates
		// and will not always display in order
		// because they have no index
		// TreeSets allow us to keep things in order, but still won't let us add duplicates
		// HashSets are generally more efficient than TreeSets
		Set<String> set = new HashSet<>();
		set.add("Cornerstone");
		set.add("DBC");
		set.add("Rusted Crow");
		set.add("ChickP");
		
		System.out.println(set);
		
		set.add("DBC"); // can't add duplicates
		System.out.println("Set: " + set);
		
		System.out.println(set.contains("ChickP"));
		System.out.println(set.size());
		System.out.println(set.isEmpty());
		
		
		// enhanced for loop for processing a set
		for (String restaurant : set) {
			System.out.println(restaurant);
		}

		
		List<String> list = new ArrayList<>();
		
		list.add("Cornerstone");
		list.add("DBC");
		list.add("Rusted Crow");
		list.add("ChickP");
		list.add("DBC");
		System.out.println("List: " + list);
	}

}
