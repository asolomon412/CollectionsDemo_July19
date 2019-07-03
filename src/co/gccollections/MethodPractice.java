package co.gccollections;

import java.util.ArrayList;
import java.util.Scanner;

public class MethodPractice {

	public static void main(String[] args) {
		int[] arrTest = { 6, 21, 54, 32 };

		System.out.println(sumArrayValues(arrTest));
		
		
		ArrayList<Integer> listTest = new ArrayList<>();
		listTest.add(5);
		listTest.add(55);
		
		System.out.println(sumArrayValues(listTest));
		
		Scanner scnr = new Scanner(System.in);
		
		ArrayList<String> scanWordsTest = returnStuff(scnr, "Hello");
		System.out.println(scanWordsTest);
		
	}

	// Method Creation Steps
	// 1. access modifier
	// 2. static or nothing
	// 3. type
	// 4. name
	// 5. parameters

	public static int sumArrayValues(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	public static int sumArrayValues(ArrayList<Integer> nums) {
		int sum = 0;
		for (int i = 0; i < nums.size(); i++) {
			sum += nums.get(i);
		}
		return sum;
	}
	
	public static ArrayList<String> returnStuff(Scanner scan, String word) {
		System.out.println("Enter a word: ");
		String sentence = scan.nextLine();
		
		ArrayList<String> listOfWords = new ArrayList<>();
		listOfWords.add(word);
		listOfWords.add(sentence);
		return listOfWords;
	}
}
