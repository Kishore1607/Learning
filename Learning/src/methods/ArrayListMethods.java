package methods;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods {

	public static void main(String[] args) {

		// Create an ArrayList of Strings
		List<String> arrayList = new ArrayList<>();

		// Adding elements to the ArrayList
		arrayList.add("apple");
		arrayList.add("banana");
		arrayList.add("cherry");
		arrayList.add("date");

		// Display the ArrayList
		System.out.println("ArrayList: " + arrayList);

		// Accessing elements by index
		System.out.println("Element at index 1: " + arrayList.get(1));

		// Checking if an element exists
		boolean containsBanana = arrayList.contains("banana");
		System.out.println("Contains 'banana': " + containsBanana);

		// Removing an element by value
		arrayList.remove("cherry");
		System.out.println("After removing 'cherry': " + arrayList);

		// Checking the size of the ArrayList
		int size = arrayList.size();
		System.out.println("Size of ArrayList: " + size);

		// Checking if the ArrayList is empty
		boolean isEmpty = arrayList.isEmpty();
		System.out.println("Is ArrayList empty? " + isEmpty);

		// Clearing the ArrayList
		arrayList.clear();
		System.out.println("After clearing the ArrayList: " + arrayList);

		// Checking if the ArrayList is empty again
		isEmpty = arrayList.isEmpty();
		System.out.println("Is ArrayList empty after clearing? " + isEmpty);
	}
}
