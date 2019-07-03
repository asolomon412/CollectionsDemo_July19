package co.gccollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListDemo {
	public static void main(String[] args) {
		// declaring an ArrayList without a type
		// You will typically want to give it a type
		// otherwise everything in the list is considered
		// an object and you'll need to cast to the type you want
		ArrayList list1 = new ArrayList();

		// when we declare an ArrayList with a type
		// we use the generic type reference also known as a Primitive Wrapper
		// the type is optional on the RHS after Java 7
		ArrayList<Integer> list2 = new ArrayList<>();
		System.out.println(list2);
		// we use methods to add values to ArrayLists instead of [] like arrays
		list2.add(345);
		list2.add(65);
		list2.add(7);
		System.out.println(list2);

		// elements can be assigned to their primitive child type automatically
		int elementFromList = list2.get(2);
		System.out.println(elementFromList);

		// once the collection is sorted it can't be undone
		Collections.sort(list2);
		System.out.println("Sorted: " + list2);
		System.out.println();
		
		// Collections use the size() method instead of length like arrays
		for (int i = 0; i < list2.size(); i++) {
			System.out.println(list2.get(i));

		}
		
		list2.remove(0);
		
		System.out.println();
		// enhanced for loop example -- can use the parent wrapper type or the primitive type
		for (Integer num : list2) {
			System.out.println(num);
		}
		
		int location = list2.indexOf(345);
		System.out.println(location);
		
		if (list2.contains(23)) {
			System.out.println("You're a winner!");
		} else {
			System.out.println("You tried!");
		}
		
		// for code challenge
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many cars would you like to add? ");
		
		int userAmount = scan.nextInt();
		// need a garbage line to clear my scanner 
		// to be able to take in more than 1 word
		scan.nextLine();
		ArrayList<String> cars = new ArrayList<>();
		
		for(int i = 0; i < userAmount; i++) {
			System.out.println("Car #: " + (i+1));
			String car = scan.nextLine();
			cars.add(car);
			
		}
		
		
		System.out.println(cars);
		
		modifyCarList(cars);
		System.out.println(cars);
		scan.close();
	}
	
	
	public static ArrayList<String> modifyCarList(ArrayList<String> list){
		list.add("Mercedes");
		
		return list;
	}

}







