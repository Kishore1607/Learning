package sorting;

public class CountingSort {

    public static void countingSort(int[] array, int maxValue) {
        int[] counts = new int[maxValue + 1];
        int[] sortedArray = new int[array.length];
        
        for (int num : array) {
            counts[num]++;
        }
        
        for (int i = 1; i < counts.length; i++) {
            counts[i] += counts[i - 1];
        }
        
        for (int i = array.length - 1; i >= 0; i--) {
            int num = array[i];
            sortedArray[counts[num] - 1] = num;
            counts[num]--;
        }
        
        System.arraycopy(sortedArray, 0, array, 0, array.length);
    }

    public static void main(String[] args) {
        int[] array = {4, 2, 2, 8, 3, 3, 2};
		int maxValue = 0;
        int max = 0;
        for (int i = 1; i < array.length; i++) {
        	if(array[i] > array[max]) {
        		max = i;
        	}
        }
        maxValue = array[max];
        
        countingSort(array, maxValue);

        System.out.println("Sorted array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
