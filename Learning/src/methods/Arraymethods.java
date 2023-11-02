package methods;

import java.util.Arrays;

public class Arraymethods {
	public static void main(String[] args) {
        // Create an array
        int[] numbers = {5, 2, 8, 1, 6, 3, 7, 4};

        // Printing the original array
        System.out.println("Original Array: " + Arrays.toString(numbers));

        // 1. Sorting the array in ascending order
        Arrays.sort(numbers);
        System.out.println("Sorted Array (ascending): " + Arrays.toString(numbers));

        // 2. Searching for an element (binary search)
        int searchElement = 6;
        int index = Arrays.binarySearch(numbers, searchElement);
        System.out.println("Index of " + searchElement + ": " + index);

        // 3. Copying an array
        int[] copiedArray = Arrays.copyOf(numbers, numbers.length);
        System.out.println("Copied Array: " + Arrays.toString(copiedArray));

        // 4. Filling an array with a value
        int[] filledArray = new int[5];
        Arrays.fill(filledArray, 42);
        System.out.println("Filled Array: " + Arrays.toString(filledArray));

        // 5. Checking for array equality
        boolean areEqual = Arrays.equals(numbers, copiedArray);
        System.out.println("Arrays are equal: " + areEqual);

        // 6. Modifying an array element
        numbers[2] = 9;
        System.out.println("Modified Array: " + Arrays.toString(numbers));

        // 7. Getting the array length
        int arrayLength = numbers.length;
        System.out.println("Array Length: " + arrayLength);

        // 8. Accessing array elements
        int elementAtIndex3 = numbers[3];
        System.out.println("Element at index 3: " + elementAtIndex3);

        // 9. Iterating through an array
        System.out.print("Array elements: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // 10. Enhanced for loop for iterating through an array
        System.out.print("Array elements (enhanced for loop): ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
