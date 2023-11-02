package ArraySums;
import java.util.ArrayList;
//import java.util.Scanner;

public class RemovingDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		        Scanner v = new Scanner(System.in);
//		    int r = v.nextInt();
//		    int[] array = new int[r];
//	    for(int i=0; i<array.length; i++){
//		      array[i]=v.nextInt();
//		    }
		int[] array = {1,1,2,3,4,3,4,2,4};

		    ArrayList<Integer> distinctNumbers = new ArrayList<>();
		    for (int i = 0; i < array.length; i++) {
		        int currentNumber = array[i];
		        if (!distinctNumbers.contains(currentNumber)) {
		             distinctNumbers.add(currentNumber);
		        }
		     }
		    int length = distinctNumbers.size();
		    System.out.println("There are "+length+" distinct element in the array.");
		  }

}
