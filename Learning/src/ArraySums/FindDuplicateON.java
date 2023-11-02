package ArraySums;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicateON {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 3, 4, 5, 7, 3, 0 };
		int result = duplicate(nums);
		if (result > 0) {
			System.out.print("Duplicated element is : " + result);
		} else {
			System.out.print("No duplicate element");
		}

	}

	public static int duplicate(int[] nums) {
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			if (set.contains(nums[i])) {
				return nums[i];
			}
			set.add(nums[i]);
		}
		return 0;
	}
}
