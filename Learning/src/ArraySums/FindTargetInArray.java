package ArraySums;
import java.util.HashMap;
import java.util.Map;

public class FindTargetInArray {
	 public static void main(String[] args) {
	        int[] nums = {1, 3, 4, 5, 7, 3, 0};
	        int target = 12;
	        int[] result = twoSum(nums, target);
	        if (result != null) {
	            System.out.println("Indices of the two numbers that add up to the target: " + result[0] + " and " + result[1]);
	        } else {
	            System.out.println("No such pair found.");
	        }
	    }

	    public static int[] twoSum(int[] nums, int target) {
	        Map<Integer, Integer> map = new HashMap<>();
	        for (int i = 0; i < nums.length; i++) {
	            int complement = target - nums[i];
	            if (map.containsKey(complement)) {
	                return new int[]{map.get(complement), i};
	            }
	            map.put(nums[i], i);
	        }
	        return null;
	    }

}
