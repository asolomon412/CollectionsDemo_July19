package co.gccollections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedListDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// we can assign both ArrayList & LinkedList to the parent interface
		// List
		// We can never create a List with the new keyword because it is an interface
		List<Integer> list = new LinkedList<>();
		List<Integer> list2 = new ArrayList<>();

		LinkedList<String> names = new LinkedList<>();
		names.add("Graham");
		names.add("Raphael");
		names.add("Leya");
		names.add("Kyle");

		System.out.println(names);

		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}

		System.out.println("How many people do you want to add to the list? ");
		int numOfStudents = scan.nextInt();

		for (int i = 0; i < numOfStudents; i++) {
			System.out.println("Name #" + (i + 1) + ": ");
			String name = scan.next();
			names.add(name);
		}

		System.out.println(names);
		removeStudents(names, "Kyle");
		System.out.println(names);
	}

	public static LinkedList<String> removeStudents(LinkedList<String> students, String name) {
		students.remove(name);
		return students;
	}

}





